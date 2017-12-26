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
		
		
		//ע�ᰴť�¼�
		sub.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String strnum=regnum.getText().toString();
				String strpas=regpassword.getText().toString();
				String strsurepas=surepassword.getText().toString();
				if(strpas.equals(strsurepas)&&!strpas.equals("")){
					//�����ļ�
					 sf=getSharedPreferences("reg", Context.MODE_PRIVATE);
					 Editor editor=sf.edit();
					 editor.putString("ID",strnum );
					 editor.putString("PWD",strpas );
					 editor.commit();
						
					 
					//��ת����������
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
				//�����ļ�
				 sf=getSharedPreferences("reg", Context.MODE_PRIVATE);
				 Editor editor=sf.edit();
				 editor.putString("ID",strnum );
				 editor.putString("PWD",strpas );
				 editor.commit();
			}
		});
		//��ȡ��ť�¼�
		read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
				info.setText("�˺ţ�"+sf.getString("ID", "")+"\n"+"���룺"+sf.getString("PWD", ""));
			}
		});
}
}
