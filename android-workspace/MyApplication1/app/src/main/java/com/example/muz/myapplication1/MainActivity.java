package com.example.muz.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt_id;
    EditText txt_pwd;
    Button btn_login;
    Button btn_zhuce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login=(Button)findViewById(R.id.btn_login);
        txt_id = (EditText) findViewById(R.id.txt_id);
        txt_pwd = (EditText) findViewById(R.id.txt_pwd);
        btn_zhuce = (Button) findViewById(R.id.btn_zhuce);

        Bundle bundle=new Bundle();
        bundle=getIntent().getExtras();
        if(bundle!=null){
            String Num;
            String Pas;
            Num=bundle.getString("Num").toString();
            Pas=bundle.getString("Pas").toString();
            txt_id.setText(Num);
            txt_pwd.setText(Pas);
        }

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = txt_id.getText().toString();
                String str2 = txt_pwd.getText().toString();
                User user=new User();
                user.setNum(str1);
                user.setPassword(str2);
                boolean bool=true;
                bool=user.Jduge();
                if (bool) {
                    Intent intent = new Intent(MainActivity.this, Frist.class);
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
        btn_zhuce.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, Res.class);
                startActivity(intent);
            }
        });

    }
}
