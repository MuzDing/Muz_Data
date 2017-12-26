package com.example.android1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class First extends Activity {

	
	EditText t1;
	EditText t2;
	TextView t3;
	Button copy;
	Button but;
	String T1=null;
	String T2=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        
        t1 = (EditText) findViewById(R.id.editText1);
        t2 = (EditText) findViewById(R.id.editText2);
        t3=(TextView)findViewById(R.id.textView1);
        copy = (Button) findViewById(R.id.copy);
        but = (Button) findViewById(R.id.button2);
        copy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				T1=t1.getText().toString();
				t2.setText(T1);
				
				
			}
		});
        but.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				T1=t1.getText().toString();
				t3.setText(T1);
				
				
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
