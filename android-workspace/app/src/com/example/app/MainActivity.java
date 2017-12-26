package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText num;
	EditText password;
	Button log;
	Button reg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		num = (EditText) findViewById(R.id.num);
		password = (EditText) findViewById(R.id.pas);
		log = (Button) findViewById(R.id.log);
		reg = (Button) findViewById(R.id.register);
		
		
		 Bundle bundle=new Bundle();
         bundle=getIntent().getExtras();
         if(bundle!=null){
         String Num;Num=bundle.getString("Num").toString();
         String Pas;Pas=bundle.getString("Pas").toString();
         num.setText(Num);
         password.setText(Pas);
         }
		log.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str1 = num.getText().toString();
				String str2 = password.getText().toString();
				User user=new User();
				user.setNum(str1);
				user.setPassword(str2);
				boolean bool=true;
				bool=user.Jduge();
				if (bool) {
					Intent intent = new Intent(MainActivity.this, First.class);
					Bundle bundle=new Bundle();
					bundle.putString("Num",str1);
					intent.putExtras(bundle);
					startActivity(intent);
				} else {
					Intent intent = new Intent(MainActivity.this, Error.class);
					startActivity(intent);
				}
			}
		});
		
				reg.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, Res.class);
				startActivity(intent);
			}
		});
	}

}