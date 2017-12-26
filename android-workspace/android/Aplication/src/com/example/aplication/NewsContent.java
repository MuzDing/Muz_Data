package com.example.aplication;

import com.example.apication.R;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class NewsContent extends Activity{
	TextView t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newscontent);
		t=(TextView) findViewById(R.id.textView1);
		Intent intent = getIntent();
		DbHelper dbHelper=new DbHelper(this,"News.db");
		String id = intent.getStringExtra("id");
		String num = intent.getStringExtra("num");
		Cursor c1;
		c1=dbHelper.QueryContent(num,id);
      	c1.moveToFirst();//移到第一条记录
      	int IDIndex=c1.getColumnIndex("content");
		String content=c1.getString(IDIndex);
		t.setText(content);
	}

}
