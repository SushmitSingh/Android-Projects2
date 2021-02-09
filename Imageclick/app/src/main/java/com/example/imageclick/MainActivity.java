package com.example.imageclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   ImageView image;
   boolean change=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (change == true)
              {
                  change = false;
                  image.setBackgroundResource(R.drawable.server);
              }
              else {
                  change = true;
                  image.setBackgroundResource(R.drawable.iphone);
              }
            }
        });
    }

}