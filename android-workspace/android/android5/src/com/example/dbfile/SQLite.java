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
    //添加用户
    public void InsertUser(View v)
    {
    	boolean ret;
        //获取用户输入的账号和密码
    	Num=num.getText().toString();
    	Pas=password.getText().toString();

		//封装数据

        User user=new User();
        user.setNum(Num);
        user.setPassword(Pas);
        
        //调用用户类库实现数据的添加
		DbHelper dbHelper=new DbHelper(this,"UserData.db");
		ret=dbHelper.InsertData(user);

        if(ret==true)
        {
			tvInfo.setText("添加成功");	        	
        }
        else
        {
			tvInfo.setText("添加失败,账号已存在！");
        }

    }
    
    //读取用户
    public void ReadUser(View v)
    {
        //获取输入的账号
    	Num=num.getText().toString();
    	DbHelper dbHelper=new DbHelper(this,"UserData.db");
		String p=dbHelper.QueryUser(Num);
		if(p.equals("")){
			tvInfo.setText("查询失败，不存在该用户！");	
		}else{
			password.setText(p);
			tvInfo.setText("查询成功！");
		}
    }
    public void UpdateUser(View v){
    	 //获取输入的账号
    	Num=num.getText().toString();
    	Pas=password.getText().toString();
    	DbHelper dbHelper=new DbHelper(this,"UserData.db");
    	int rs=dbHelper.UpdateUser(Num,Pas);
    	if(rs==1){
    		tvInfo.setText("修改成功！");
    	}else{
    		tvInfo.setText("修改失败，不存在该用户！");
    	}

    }
    public void DeleteUser(View v){
    	 //获取输入的账号
    	Num=num.getText().toString();
    	DbHelper dbHelper=new DbHelper(this,"UserData.db");
    	int rs=dbHelper.DeleteUser(Num);
    	if(rs==1){
    		tvInfo.setText("删除成功！");
    	}else{
    		tvInfo.setText("删除失败，不存在该用户！");
    	}
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sqlite, menu);
        return true;
    }
    
}
