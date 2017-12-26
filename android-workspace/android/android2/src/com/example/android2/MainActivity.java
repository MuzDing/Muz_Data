package com.example.android2;

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
	Button reg;
	String Num=null;
	String Pas=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        num = (EditText) findViewById(R.id.num);
		password = (EditText) findViewById(R.id.password);
		log = (Button) findViewById(R.id.log);
		reg = (Button) findViewById(R.id.reg);
		Bundle bundle=new Bundle();
        bundle=getIntent().getExtras();
        if(bundle!=null){
        Num=bundle.getString("Num").toString();
        Pas=bundle.getString("Pas").toString();
        num.setText(Num);
        password.setText(Pas);
        }
		
		log.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Num=num.getText().toString();
				Pas=password.getText().toString();
				User user=new User();
				user.setNum(Num);
				user.setPassword(Pas);
				if(user.Check(user)){
					Intent intent = new Intent(MainActivity.this, First.class);
					Bundle bundle=new Bundle();
					bundle.putString("Num",Num);
					bundle.putString("Pas",Pas);
					intent.putExtras(bundle);
					startActivity(intent);
				}else{
					Intent intent = new Intent(MainActivity.this, Error.class);
					startActivity(intent);
				}
				
			}
		});
		
		reg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Res.class);
				startActivity(intent);
				
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
