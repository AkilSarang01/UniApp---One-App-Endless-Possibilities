package com.appdid.allinoneshoppingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
    public void F1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.zomato.com/"));
        startActivity(intent);
    }

    public void F2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.swiggy.com/"));
        startActivity(intent);
    }

    public void F3(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.foodpanda.com/"));
        startActivity(intent);
    }

    public void F4(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dominos.co.in/"));
        startActivity(intent);
    }

    public void F5(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.mcdelivery.co.in/home/trending"));
        startActivity(intent);
    }

    public void F6(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.faasos.com/"));
        startActivity(intent);
    }
    public void F7(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.pizzahut.co.in/"));
        startActivity(intent);
    }
    public void F8(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.justeattakeaway.com/"));
        startActivity(intent);
    }
}