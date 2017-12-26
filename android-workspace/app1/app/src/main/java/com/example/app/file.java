package com.example.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by muz on 17-9-27.
 */

public class file extends Activity {
    EditText txt_id;
    EditText txt_pwd;
    Button btn_login;
    Button btn_save;

    String str_id,str_pwd;

    SharedPreferences sf;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_id=(EditText)findViewById((R.id.txt_id));
        txt_pwd=(EditText)findViewById((R.id.txt_pwd));
        btn_login=(Button) findViewById((R.id.btn_login));
        btn_save=(Button)findViewById((R.id.btn_save));

        str_id = txt_id.getText().toString();
        str_pwd = txt_pwd.getText().toString();

        sf=getSharedPreferences("login", Context.MODE_PRIVATE);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor =sf.edit();
                editor.putString("id",str_id);
                editor.putString("pwd",str_pwd);
                editor.commit();
            }
        });
    }

}
