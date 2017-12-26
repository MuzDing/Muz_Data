package cn.czu.db;

import cn.czu.user.User;
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

		String sql = "create table user (num integer primary key,password varchar)";
		db.execSQL(sql);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
	
	//添加用户
	
	public boolean InsertData(User user)
	{

		ContentValues cv=new ContentValues();
		cv.put("num", user.getNum());
		cv.put("password", user.getPassword());
		
		
		SQLiteDatabase db=getWritableDatabase();
		long r=db.insert("user", null,cv );

		
		if(r>0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}

	

	
	//查询用户

	public String QueryUser(String num) {
		Cursor c=null;
		String content="";
		SQLiteDatabase db=getReadableDatabase();
		c=db.rawQuery("select * from user where num='"+num+"'", null);
		while(c.moveToNext()){
			c.moveToFirst();//移到第一条记录
	      	int IDIndex=c.getColumnIndex("password");
			content=c.getString(IDIndex);
		}
		
		return content;
		
	}

	public int DeleteUser(String num) {
		SQLiteDatabase db=getReadableDatabase();
		String[] args = {num};
		int i=db.delete("user", "num=?",args);
		return i;
	}

	public int UpdateUser(String num,String password) {
		SQLiteDatabase db=getReadableDatabase();
		ContentValues cv=new ContentValues();
		cv.put("num",num);
		cv.put("password",password);
		String[] args = {num};
		int i=db.update("user", cv, "num=?", args);
		return i;
	}

	
	

}
