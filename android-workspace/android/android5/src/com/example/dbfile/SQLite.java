package com.example.dbfile;

import cn.czu.db.DbHelper;
import cn.czu.user.User;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SQLite extends Activity {

	EditText num;
	EditText password;
	Button btnSave;
	Button btnRead;
	
	Button btnDBSave;
	Button btnReadUser;
	
	TextView tvInfo;
	
	SharedPreferences sf;
	
	String Num=null;
	String Pas=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        
        
        num=(EditText)findViewById(R.id.num);
        password=(EditText)findViewById(R.id.password);
        tvInfo=(TextView)findViewById(R.id.tvInfo);
    }
    //����û�
    public void InsertUser(View v)
    {
    	boolean ret;
        //��ȡ�û�������˺ź�����
    	Num=num.getText().toString();
    	Pas=password.getText().toString();

		//��װ����

        User user=new User();
        user.setNum(Num);
        user.setPassword(Pas);
        
        //�����û����ʵ�����ݵ����
		DbHelper dbHelper=new DbHelper(this,"UserData.db");
		ret=dbHelper.InsertData(user);

        if(ret==true)
        {
			tvInfo.setText("��ӳɹ�");	        	
        }
        else
        {
			tvInfo.setText("���ʧ��,�˺��Ѵ��ڣ�");
        }

    }
    
    //��ȡ�û�
    public void ReadUser(View v)
    {
        //��ȡ������˺�
    	Num=num.getText().toString();
    	DbHelper dbHelper=new DbHelper(this,"UserData.db");
		String p=dbHelper.QueryUser(Num);
		if(p.equals("")){
			tvInfo.setText("��ѯʧ�ܣ������ڸ��û���");	
		}else{
			password.setText(p);
			tvInfo.setText("��ѯ�ɹ���");
		}
    }
    public void UpdateUser(View v){
    	 //��ȡ������˺�
    	Num=num.getText().toString();
    	Pas=password.getText().toString();
    	DbHelper dbHelper=new DbHelper(this,"UserData.db");
    	int rs=dbHelper.UpdateUser(Num,Pas);
    	if(rs==1){
    		tvInfo.setText("�޸ĳɹ���");
    	}else{
    		tvInfo.setText("�޸�ʧ�ܣ������ڸ��û���");
    	}

    }
    public void DeleteUser(View v){
    	 //��ȡ������˺�
    	Num=num.getText().toString();
    	DbHelper dbHelper=new DbHelper(this,"UserData.db");
    	int rs=dbHelper.DeleteUser(Num);
    	if(rs==1){
    		tvInfo.setText("ɾ���ɹ���");
    	}else{
    		tvInfo.setText("ɾ��ʧ�ܣ������ڸ��û���");
    	}
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sqlite, menu);
        return true;
    }
    
}
