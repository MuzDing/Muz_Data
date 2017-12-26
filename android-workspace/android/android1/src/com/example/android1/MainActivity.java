package com.example.android1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	EditText num;
	EditText password;
	Button log;
	String Num=null;
	String Pas=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        num = (EditText) findViewById(R.id.num);
		password = (EditText) findViewById(R.id.password);
		log = (Button) findViewById(R.id.log);
		log.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Num=num.getText().toString();
				Pas=password.getText().toString();
				if(Num.equals("1234")&&Pas.equals("4321")){
					Intent intent = new Intent(MainActivity.this, First.class);
					startActivity(intent);
				}else{
					Intent intent = new Intent(MainActivity.this, Error.class);
					startActivity(intent);
				}
				
			}
		});
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
