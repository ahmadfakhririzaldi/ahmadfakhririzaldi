package com.example.fakhri.fakhri_1202150041_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LembarKedua extends AppCompatActivity {
    TextView tvrestaurant, tvmenu, tvportion, tvprice;
    String restaurant,menu;
    int portion,price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembar_kedua);
        tvrestaurant =(TextView) findViewById(R.id.Restaurant);
        tvmenu = (TextView) findViewById(R.id.tv_menu);
        tvportion = (TextView) findViewById(R.id.portion);
        tvprice = (TextView) findViewById(R.id.tv_price);

        Intent intent= getIntent();
        restaurant = intent.getStringExtra( "restaurant");
        menu = intent.getStringExtra( "menu");
        portion = intent.getIntExtra( "portion", 0);
        price = intent.getIntExtra( "price", 0);

        tvrestaurant.setText(restaurant);
        tvmenu.setText(menu);
        tvportion.setText(""+portion);
        tvprice.setText("Rp  "+price);

        Toast toast = null;
        if (price < 65000) {
            toast = Toast.makeText(getApplicationContext(), "Makan disini aja", Toast.LENGTH_SHORT);
        }else {
            toast = Toast.makeText(getApplicationContext(), "Jangan Makan disini sayang, uang kamu tidak cukup", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
