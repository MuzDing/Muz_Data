package com.example.aplication;

import com.example.aplication.News;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

	public DbHelper(Context context, String name) {
		super(context, name, null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub

		String sql = "create table newsdata (id integer primary key ," +
				"title varchar,content varchar)";
		db.execSQL(sql);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
	
	//添加新闻
	
	public boolean InsertData(News news)
	{

		ContentValues cv=new ContentValues();
		cv.put("title", news.getTitle());
		cv.put("content", news.getContent());
		
		
		SQLiteDatabase db=getWritableDatabase();
		long r=db.insert("newsdata", null,cv );

		
		if(r>0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}

	

	
	//读取所有新闻
	public Cursor QueryAllUsesr(String num)
	{
		Cursor c=null;
		SQLiteDatabase db=getReadableDatabase();
		c=db.rawQuery("select * from newsdata where type='"+num+"'",null);
		return c;
		
	}

	

	public Cursor QueryContent(String num, String id) {
		Cursor c=null;
		SQLiteDatabase db=getReadableDatabase();
		c=db.rawQuery("select * from newsdata where type='"+id+"' and conid='"+num+"'",null);
		return c;
	}

	
	

}
