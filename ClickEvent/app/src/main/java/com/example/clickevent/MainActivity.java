package com.example.clickevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @java.lang.Override
    public void onClick(View v) {

    }
// Onclick 1
//    public void My_Method(View view) {
//        Toast.makeText(this, "Message By Toast", Toast.LENGTH_SHORT).show();
//    }

//    public void Click(View view) {
//        Toast.makeText(this, "This Toast by OnClick", Toast.LENGTH_SHORT).show();
//    }

}