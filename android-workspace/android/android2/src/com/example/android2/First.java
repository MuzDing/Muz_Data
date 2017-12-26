package com.example.android2;

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

	TextView t1;
	TextView t2;
	String num=null;
	String pas=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        Bundle bundle=new Bundle();
        bundle=getIntent().getExtras();
        if(bundle!=null){
        	num=bundle.getString("Num").toString();
        	pas=bundle.getString("Pas").toString();
        	t1.setText("当前用户账号为"+num);
        	t2.setText("当前用户密码为"+pas);
        }
        
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
