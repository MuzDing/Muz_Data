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
        
        //��ȡ�������ϵĿؼ�
    	etUserAccount=(EditText)findViewById(R.id.etUserAccount);
        etUserPassWord=(EditText)findViewById(R.id.etUserPassWord);
        tvInfo=(TextView)findViewById(R.id.tvInfo);
    }
 
    //�������
    public void InsertUser(View v)
    {
    	boolean ret;
        //��ȡ�û�������˺ź�����
    	newsID=etUserAccount.getText().toString();
    	newsTitle=etUserPassWord.getText().toString();

		//��װ����

        News  news=new News();
        news.setNewsID(newsID);
        news.setNewsTitle(newsTitle);
        
        //�����û����ʵ�����ݵ����
		DbHelper dbHelper=new DbHelper(this,"NewsData.db");
		ret=dbHelper.InsertData(news);

        if(ret==true)
        {
			tvInfo.setText("������ųɹ�");	        	
        }
        else
        {
			tvInfo.setText("�������ʧ��");
        }

    }
    
    //��ȡ�û�
    public void ReadAllUsers(View v)
    {
    	Intent intent=new Intent(SQLite.this,first.class);
    	startActivity(intent);	

    }
    
  //ѡ��˵�
  	@Override
  	public boolean onCreateOptionsMenu(Menu menu) {
  		menu.add(Menu.NONE,Menu.FIRST,Menu.FIRST, "�½�").setIcon(android.R.drawable.ic_menu_add);
  		menu.add(Menu.NONE,Menu.FIRST+1,Menu.FIRST+1,"����").setIcon(android.R.drawable.ic_menu_save);
  		menu.add(Menu.NONE,Menu.FIRST+2,Menu.FIRST+2, "ɾ��").setIcon(android.R.drawable.ic_menu_delete);
  		
  		
  		SubMenu sm=menu.addSubMenu(Menu.NONE,Menu.FIRST+7,Menu.FIRST+7,"�鿴");
  		sm.add(Menu.NONE,Menu.FIRST+3,Menu.FIRST+3,"��ʷ");
  		sm.add(Menu.NONE,Menu.FIRST+4,Menu.FIRST+4, "��Ϣ");
  		sm.add(Menu.NONE,Menu.FIRST+5,Menu.FIRST+5,"����");
  		sm.setHeaderIcon(android.R.drawable.ic_menu_manage);
  		sm.setIcon(android.R.drawable.ic_menu_more);
  		
  		
  		return true;
  	}
  	
    
    
    
}
