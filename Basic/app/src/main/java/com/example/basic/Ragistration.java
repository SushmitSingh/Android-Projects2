package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Ragistration extends AppCompatActivity {
    private EditText rname,rmobile,rpassword;
    private CheckBox mRemember;
    private Button mforRagisterButton;
    private TextView mLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragistration);
        rname=findViewById(R.id.raName);
        rmobile=findViewById(R.id.raMobile);
        rpassword=findViewById(R.id.raPassWord);
        mRemember=findViewById(R.id.RcheckBox);
        mforRagisterButton=findViewById(R.id.rButton);
        mLogin=findViewById(R.id.RforLogin);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Ragistration.this,MainActivity.class);
                startActivity(k);
            }
        });





    }
}