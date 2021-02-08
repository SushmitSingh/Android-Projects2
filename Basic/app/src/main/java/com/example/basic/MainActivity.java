package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText memail,mPassword;
    private CheckBox checklogin;
   private Button mlogin;
   private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        memail = findViewById(R.id.lEmailView);
        mPassword = findViewById(R.id.lPassword);
        checklogin = findViewById((R.id.lcheckBox));
        mlogin = findViewById((R.id.lbutton));
        register = findViewById(R.id.lforRagistrationButton);

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MainPage.class);
                startActivity(i);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,Ragistration.class);
                  startActivity(j);
            }
        });

    }
}