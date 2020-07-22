package com.example.random13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //public int a = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int value = tinhtong(5,10);
        Log.d("BBB",String.valueOf(value));
    }
    private int tinhtong(int a, int b){
        int tong = a +b;
        return tong;
    }
    // ctrl + p xem tham số truyền vào
}