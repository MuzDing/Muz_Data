package com.example.muz.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by muz on 17-9-20.
 */

public class Frist extends Activity {
    EditText txt1;
    EditText txt2;
    TextView name;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist);
       // txt1 = (EditText) findViewById(R.id.txt1);
       // txt2 = (EditText) findViewById(R.id.txt2);
      //  name = (TextView) findViewById(R.id.name);
      //  add = (Button) findViewById(R.id.add);


        Bundle bundle=new Bundle();
        bundle=getIntent().getExtras();
        if(bundle!=null){
            String Num;Num=bundle.getString("Num").toString();
            name.setText(Num);
        }

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String str1 = txt1.getText().toString();
                txt2.setText(str1);
            }
        });
    }
}
