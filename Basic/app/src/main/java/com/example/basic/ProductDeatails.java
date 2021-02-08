package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDeatails extends AppCompatActivity {

    private ImageView images;
    private TextView nametext;
    private TextView priceText;
    private TextView description;
    private Button buy;
    private Button addtocart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_deatails);
            int position = getIntent().getIntExtra("key",-1);
            images=findViewById(R.id.imageView);
            nametext=findViewById(R.id.Text1);
            priceText=findViewById(R.id.Text2);
            description=findViewById(R.id.editTextTextMultiLine);
            buy=findViewById(R.id.button3);
            addtocart=findViewById(R.id.button4);
            MainPage mp=new MainPage();

            images.setImageResource(mp.product_image[position]);
            nametext.setText(mp.items[position]);
            priceText.setText(mp.price[position]);
            description.setText(mp.bio[position]);



    }
}