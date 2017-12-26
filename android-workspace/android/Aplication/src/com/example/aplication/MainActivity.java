package com.example.aplication;

import com.example.apication.R;
import com.example.aplication.MainActivity;
import com.example.aplication.User;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button log;
	Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        log=(Button) findViewById(R.id.log);
        reg=(Button)findViewById(R.id.reg);
        
        log.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Ã· æ£∫≥ı º’À∫≈£∫1234£¨≥ı º√‹¬Î£∫4321", Toast.LENGTH_LONG)
				.show();
				createLoginDialog();
			}
		});
        
        reg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {		
				Intent intent = new Intent(MainActivity.this,Res.class);
				startActivity(intent);
			}
		});
        }
       


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
    public void createLoginDialog(){
		AlertDialog.Builder builder =new AlertDialog.Builder(this);
		builder.setTitle("”√ªßµ«¬º");
		builder.setIcon(android.R.drawable.ic_menu_myplaces);
		//
		LayoutInflater inflater =LayoutInflater.from(this);
		View loginView=inflater.inflate(R.layout.logindialoglayout, null);
		final EditText name;
		final EditText pwd;
		name=(EditText) loginView.findViewById(R.id.login_name);
		pwd=(EditText) loginView.findViewById(R.id.login_password);
		builder.setView(loginView);
		builder.setPositiveButton("µ«¬º",new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				String n=name.getText().toString();
				String p=pwd.getText().toString();
				User user=new User();
				user.setNum(n);
				user.setPassword(p);
				boolean bool=true;
				SharedPreferences sf;
				sf=getSharedPreferences("reg", Context.MODE_PRIVATE);
				bool=user.Jduge(sf.getString("ID", ""),sf.getString("PWD", ""));
				
				if(bool){
					Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
					
				Toast.makeText(MainActivity.this, "µ«¬º≥…π¶£°", Toast.LENGTH_LONG)
					.show();
				startActivity(intent);
				}
				else{
					Toast.makeText(MainActivity.this, "µ«¬º ß∞‹£°’À∫≈ªÚ√‹¬Î¥ÌŒÛ£°", Toast.LENGTH_LONG)
					.show();
				}
			}}
		);
		builder.setNegativeButton("»°œ˚",new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
			}
		});
		builder.show();
	}
    
}
