package com.example.fakhri.fakhri_1202150041_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFood, etPortion; // untuk deklarasi objek
    String restaurant,menu;
    Intent intent;
    int portion;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // method ketika dijalankan saat aktivity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFood = (EditText) findViewById(R.id.et_food); //masukan makanan
        etPortion = (EditText) findViewById(R.id.et_portion); //msukan porsi
        intent = new Intent(this,LembarKedua.class);
    }

    public void onEatBus(View view) {

        menu = etFood.getText().toString();
       restaurant = "Eatbus";
       portion = Integer.parseInt(etPortion.getText().toString());
        int total = 50000 * Integer.parseInt(etPortion.getText().toString());//jumlh porsi dikali harga restoran kemudian dipaksa menjadi integer
        Log.d( "TOTAL HARGA",  "Rp."+total);
                intent.putExtra("resturant",restaurant);
                intent.putExtra("menu",menu);
                intent.putExtra("portion",portion);
                intent.putExtra("price",total);
                startActivity(intent);
    }

    public void onAbnormal(View view) {
        restaurant ="Abnormal";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 30000 * Integer.parseInt(etPortion.getText().toString());//jumlh porsi dikali harga restoran kemudian dipaksa menjadi integer
        Log.d( "TOTAL HARGA",  "Rp."+total);
        intent.putExtra("resturant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}
