package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Res extends Activity {
	EditText regnum;
	EditText regpassword;
	EditText surepassword;
	Button sub;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reg);
		regnum = (EditText) findViewById(R.id.regnum);
		regpassword = (EditText) findViewById(R.id.regpas);
		surepassword = (EditText) findViewById(R.id.surepas);
		sub = (Button) findViewById(R.id.submit);
		sub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String strnum=regnum.getText().toString();
				String strpas=regpassword.getText().toString();
				String strsurepas=surepassword.getText().toString();
				if(strpas.equals(strsurepas)&&!strpas.equals("")){
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
}
}
