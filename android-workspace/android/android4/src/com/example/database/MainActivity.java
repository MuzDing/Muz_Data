package com.example.database;






import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	EditText savecontent;
	EditText readcontent;
	Button save;
	Button read;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        savecontent=(EditText) findViewById(R.id.editText1);
        readcontent=(EditText) findViewById(R.id.editText2);
        save=(Button) findViewById(R.id.save);
        read=(Button) findViewById(R.id.read);
        
        
        
       
       
    }
    
    public void Save(View v) {
		String name=savecontent.getText().toString();
		DBHelper db=new DBHelper(this, "User.db");
    
    	db.InsertData(name);
	}
    
    public void Read(View v) {
    	Cursor c;
    	int Count=0;
    	String str="";
    	DBHelper db=new DBHelper(this, "User.db");
    	c=db.QueryData();
    	Count=c.getCount();
    	
    	c.moveToFirst();
    	//循环获取姓名
    	for(int i=0;i<Count;i++ )
    	{
    	
    		//获取姓名的列下标
    		int nameIndex=c.getColumnIndex("name");
    			
    		str=str+c.getString(nameIndex)+",";
    		c.moveToNext();
    		
    		
    	}
    	
    	//Log.i("Tag", String.valueOf(c.getCount()));
    	readcontent.setText( str);
    	
	}
  

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
