package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.View.OnClickListener;

public class DBHelper extends SQLiteOpenHelper {

	

	public DBHelper(Context context, String name) {
		super(context, name, null, 1);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "create table User (id integer primary key autoincrement," +
				"name varchar)";
			db.execSQL(sql);
		
	}

	
	public void InsertData(String name)
	{
		ContentValues cv=new ContentValues();
		cv.put("name", name);
		
		SQLiteDatabase db=getWritableDatabase();
		long r=db.insert("User", null,cv );
		
	}
	
	
	public Cursor QueryData()
	{
		Cursor c=null;
		
		SQLiteDatabase db=getReadableDatabase();
		String[] columns={"name"};
		c=db.query("User", columns, null, null, null, null, null);
		return c;
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}



}
