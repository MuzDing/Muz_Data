package com.example.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Res extends Activity {
	EditText regnum;
	EditText regpassword;
	EditText surepassword;
	Button sub;
	Button save;
	Button read;
	SharedPreferences sf;
	TextView info;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reg);
		regnum = (EditText) findViewById(R.id.regnum);
		regpassword = (EditText) findViewById(R.id.regpas);
		surepassword = (EditText) findViewById(R.id.surepas);
		sub = (Button) findViewById(R.id.submit);
		save = (Button) findViewById(R.id.btnSave);
		read=(Button)findViewById(R.id.btnRead);
		info=(TextView)findViewById(R.id.textinfo);
		
		
		//注册按钮事件
		sub.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String strnum=regnum.getText().toString();
				String strpas=regpassword.getText().toString();
				String strsurepas=surepassword.getText().toString();
				if(strpas.equals(strsurepas)&&!strpas.equals("")){
					//存入文件
					 sf=getSharedPreferences("reg", Context.MODE_PRIVATE);
					 Editor editor=sf.edit();
					 editor.putString("ID",strnum );
					 editor.putString("PWD",strpas );
					 editor.commit();
						
					 
					//跳转并保存数据
					Intent intent = new Intent(Res.this, MainActivity.class);
					Bundle bundle=new Bundle();
					bundle.putString("Num",strnum);
					bundle.putString("Pas",strpas);
					intent.putExtras(bundle);
					startActivity(intent);
					
				}else{
					Intent intent = new Intent(Res.this, RE_Error.class);
					startActivity(intent);
				}
				
			}
		});
		
		save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String strnum=regnum.getText().toString();
				String strpas=regpassword.getText().toString();
				//存入文件
				 sf=getSharedPreferences("reg", Context.MODE_PRIVATE);
				 Editor editor=sf.edit();
				 editor.putString("ID",strnum );
				 editor.putString("PWD",strpas );
				 editor.commit();
			}
		});
		//读取按钮事件
		read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
				info.setText("账号："+sf.getString("ID", "")+"\n"+"密码："+sf.getString("PWD", ""));
			}
		});
}
}
