package com.example.android2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RE_Error extends Activity{
	
	Button btn;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.re_error);
		btn=(Button) findViewById(R.id.bntReturn);
		btn.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent intent = new Intent(RE_Error.this, Res.class);
					startActivity(intent);
				
			}
		});
	}
}
