package com.example.basic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

     String[] bio ={"The iPhone is a line of smartphones designed and marketed by Apple Inc. that use Apple's iOS mobile operating system.",
     "A computer mouse (plural mice, rarely mouses) is a hand-held pointing device that detects two-dimensional motion relative to a surface.",
     "It is also sometimes called a solid-state device or a solid-state disk, even though SSDs lack the physical spinning disks and...",
     "A light-emitting diode (LED /ɛlid/) is a semiconductor light source that emits light when current flows through it. ",
     "A laptop or laptop computer, is a small, portable personal computer (PC) with a  form factor, typically having a thin LCD or LED computer screen ...",
      "A cooler, portable ice chest, ice box, cool box, chilly bin (in New Zealand), or esky (Australia) is an insulated box used to keep food or drink cool. Ice cubes are ..",
     "Server (computing) · A computer network diagram of client computers communicating with a server computer via the Internet · Wikimedia Foundation rackmount ..."};
    ListView listview;
    String[] items =  {"Iphone","Mouse","SSD","Led","Laptop","Cooler","Server"};
    String[] price =  {"Rs -130000","Rs -400","Rs -4000","Rs -120","Rs -75000","Rs -8000","Rs -80000"};
    int[] product_image ={R.drawable.iphone,R.drawable.mouse,R.drawable.ssd,R.drawable.led,
                                R.drawable.laptop,R.drawable.cooler,R.drawable.server};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        listview = findViewById(R.id.listView);


       //ArrayAdapter Ada=new ArrayAdapter(MainPage.this,R.layout.support_simple_spinner_dropdown_item,items);
         //mainmast.setAdapter(Ada);
        CustomAdapter ca=new CustomAdapter(MainPage.this,items,price,product_image);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent in=new Intent(MainPage.this,ProductDeatails.class);
                in.putExtra("key",position);
                startActivity(in);
            }
        });
        listview.setAdapter(ca);
    }
}