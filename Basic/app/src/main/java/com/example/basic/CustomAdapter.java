package com.example.basic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] product;
    String[] price;
    int[] image;
    LayoutInflater infleter;
    public CustomAdapter(MainPage mainPage, String[] items, String[] price, int[] product_image) {
        this.image = product_image;
        this.product=items;
        this.price=price;
        infleter= LayoutInflater.from(mainPage);
    }

    @Override
    public int getCount() {
        return product.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=infleter.inflate(R.layout.custom,null);
        ImageView proimage= convertView.findViewById(R.id.Imageview);
        TextView textprice= convertView.findViewById(R.id.PriceView);
        TextView textItem=convertView.findViewById(R.id.ItemName);

        proimage.setImageResource(image[position]);
        textprice.setText(price[position]);
        textItem.setText(product[position]);

        return convertView;
    }
}
