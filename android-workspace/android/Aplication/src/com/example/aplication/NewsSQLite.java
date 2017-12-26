package com.example.aplication;

import java.util.ArrayList;
import java.util.List;
import android.app.AlertDialog.Builder;
import com.example.apication.R;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewsSQLite extends Activity {

	
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.news);
		 Intent intent = getIntent();
		 final String id = intent.getStringExtra("value");
		//获取主界面上的ListView控件
		lv=(ListView)findViewById(R.id.listView1);
		//生成数据列表
		final List<String> data=new ArrayList<String>();
		//从数据库中读出相应的数据并加载到data中	
      	Cursor c;
      	int recCount=0;
      	String str="";
		final DbHelper dbHelper=new DbHelper(this,"News.db");
		c=dbHelper.QueryAllUsesr(id);
      	recCount=c.getCount();//获取用户的记录数
      	
      	c.moveToFirst();//移到第一条记录
      	//循环获取用户账号
      	for(int i=0;i<recCount;i++ )
      	{
      		//获取姓名的列下标
      		int IDIndex=c.getColumnIndex("title");
      		str=c.getString(IDIndex);
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
					Intent intent = new Intent(NewsSQLite.this, NewsContent.class);
					intent.putExtra("num", arg2+"");
					intent.putExtra("id", id);
					startActivity(intent);
					
					
				}	
			}); 
			
	//给ListView添加长按事件，弹出菜单
		lv.setOnItemLongClickListener(new OnItemLongClickListener() {

				public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {				
					registerForContextMenu(lv);				
					return false;
				}
			});
		
	}
	//创建弹出式菜单
	@Override
	public void onCreateContextMenu(ContextMenu menu,View v,ContextMenuInfo menuInfo)
	{
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.setHeaderIcon(android.R.drawable.ic_menu_manage);
		menu.setHeaderTitle("更多操作：");
		menu.add(Menu.NONE,Menu.FIRST,Menu.FIRST, "分享");
		menu.add(Menu.NONE,Menu.FIRST+1,Menu.FIRST+1,"收藏");
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
