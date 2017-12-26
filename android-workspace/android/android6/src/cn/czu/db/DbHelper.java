package cn.czu.db;

import cn.czu.user.News;
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

		String sql = "create table news (_id integer primary key autoincrement," +
				"newsID varchar,newsTitle varchar)";
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
		cv.put("NewsID", news.getNewsID());
		cv.put("NewsTitle", news.getNewsTitle());
		
		
		SQLiteDatabase db=getWritableDatabase();
		long r=db.insert("news", null,cv );

		
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
	public Cursor QueryAllUsesr()
	{
		Cursor c=null;
		SQLiteDatabase db=getReadableDatabase();
		String[] columns = {"newsID","newsTitle"};
		c=db.query("news", columns, null, null, null, null, null);
		return c;
	}

	
	

}
