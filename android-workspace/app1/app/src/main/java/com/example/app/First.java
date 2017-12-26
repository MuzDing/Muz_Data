package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class First extends Activity {

	EditText txt1;
	EditText txt2;
	TextView name;
	Button add;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		txt1 = (EditText) findViewById(R.id.txt1);
		txt2 = (EditText) findViewById(R.id.txt2);
		name = (TextView) findViewById(R.id.name);
		add = (Button) findViewById(R.id.add);

		
		 Bundle bundle=new Bundle();
         bundle=getIntent().getExtras();
         if(bundle!=null){
         String Num;Num=bundle.getString("Num").toString();
         name.setText(Num);
         }
         
		add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str1 = txt1.getText().toString();
				txt2.setText(str1);
			}
		});
	}
}