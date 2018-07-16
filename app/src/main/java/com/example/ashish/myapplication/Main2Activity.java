package com.example.ashish.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tv3;
    EditText et1;
    EditText et2;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv3=(TextView)findViewById(R.id.tv3);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("admin") && et2.getText().toString().equals("12345")){
                    Toast.makeText(getApplicationContext(),"LOGIN SUCCESS",Toast.LENGTH_LONG);
                    Intent myint=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(myint);
                }else{
                    Toast.makeText(getApplicationContext(),"enter the proper userid or password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
