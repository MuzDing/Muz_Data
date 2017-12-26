package com.example.dbfile;

import cn.czu.db.DbHelper;
import cn.czu.user.News;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SQLite extends Activity {

	EditText etUserAccount;
	EditText etUserPassWord;
	Button btnSave;
	Button btnRead;
	
	Button btnDBSave;
	Button btnReadUser;
	
	TextView tvInfo;
	
	SharedPreferences sf;
	
	String newsID=null;
	String newsTitle=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        
        //获取主界面上的控件
    	etUserAccount=(EditText)findViewById(R.id.etUserAccount);
        etUserPassWord=(EditText)findViewById(R.id.etUserPassWord);
        tvInfo=(TextView)findViewById(R.id.tvInfo);
    }
 
    //添加新闻
    public void InsertUser(View v)
    {
    	boolean ret;
        //获取用户输入的账号和密码
    	newsID=etUserAccount.getText().toString();
    	newsTitle=etUserPassWord.getText().toString();

		//封装数据

        News  news=new News();
        news.setNewsID(newsID);
        news.setNewsTitle(newsTitle);
        
        //调用用户类库实现数据的添加
		DbHelper dbHelper=new DbHelper(this,"NewsData.db");
		ret=dbHelper.InsertData(news);

        if(ret==true)
        {
			tvInfo.setText("添加新闻成功");	        	
        }
        else
        {
			tvInfo.setText("添加新闻失败");
        }

    }
    
    //读取用户
    public void ReadAllUsers(View v)
    {
    	Intent intent=new Intent(SQLite.this,first.class);
    	startActivity(intent);	

    }
    
  //选项菜单
  	@Override
  	public boolean onCreateOptionsMenu(Menu menu) {
  		menu.add(Menu.NONE,Menu.FIRST,Menu.FIRST, "新建").setIcon(android.R.drawable.ic_menu_add);
  		menu.add(Menu.NONE,Menu.FIRST+1,Menu.FIRST+1,"保存").setIcon(android.R.drawable.ic_menu_save);
  		menu.add(Menu.NONE,Menu.FIRST+2,Menu.FIRST+2, "删除").setIcon(android.R.drawable.ic_menu_delete);
  		
  		
  		SubMenu sm=menu.addSubMenu(Menu.NONE,Menu.FIRST+7,Menu.FIRST+7,"查看");
  		sm.add(Menu.NONE,Menu.FIRST+3,Menu.FIRST+3,"历史");
  		sm.add(Menu.NONE,Menu.FIRST+4,Menu.FIRST+4, "信息");
  		sm.add(Menu.NONE,Menu.FIRST+5,Menu.FIRST+5,"帮助");
  		sm.setHeaderIcon(android.R.drawable.ic_menu_manage);
  		sm.setIcon(android.R.drawable.ic_menu_more);
  		
  		
  		return true;
  	}
  	
    
    
    
}
