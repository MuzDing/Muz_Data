package com.example.dbfile;

import java.util.ArrayList;
import java.util.List;

import cn.czu.db.DbHelper;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

public class first extends Activity {

	
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.first);
		 
		 
		//获取主界面上的ListView控件
			lv=(ListView)findViewById(R.id.listView1);
			//生成数据列表
			final List<String> data=new ArrayList<String>();
			//=======从数据库中读出相应的数据并加载到data中===========
			
	    	
      	Cursor c;
      	int recCount=0;
      	String str="";

		DbHelper dbHelper=new DbHelper(this,"NewsData.db");
		c=dbHelper.QueryAllUsesr();
      	recCount=c.getCount();//获取用户的记录数
      	
      	c.moveToFirst();//移到第一条记录
      	//循环获取用户账号
      	for(int i=0;i<recCount;i++ )
      	{
      		//获取姓名的列下标
      		int userIDIndex=c.getColumnIndex("newsTitle");
      		str=c.getString(userIDIndex);
      		data.add(str);
      		c.moveToNext();
      		str="";
      	}		
			//构造数据适配器（把List格式的数据与主界面上的ListView控件关联起来）
			ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
			//加载数据
			lv.setAdapter(adapter);	
			

			//给ListView添加列表项单击事件
			lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
					// TODO Auto-generated method stub
					
					setTitle("第"+arg2+"条新闻");
					
				}	
			}); 
			
			//给ListView添加长按事件
			lv.setOnItemLongClickListener(new OnItemLongClickListener() {

				@Override
				public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					Builder builder=new Builder(first.this);
					builder.setTitle("新闻内容：");
					builder.setIcon(android.R.drawable.ic_dialog_info);
					builder.setMessage(data.get(arg2).toString());	
					builder.setPositiveButton("确定", null);
					builder.show();
					return false;
				}
			});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
