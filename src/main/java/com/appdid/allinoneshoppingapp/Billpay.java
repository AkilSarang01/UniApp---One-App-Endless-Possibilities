package com.appdid.allinoneshoppingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Billpay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billpay);
    }
    public void B1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://pay.amazon.com/"));
        startActivity(intent);
    }
    public void B2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://pay.google.com/gp/w/u/0/home/signup?sctid=3085748425364063"));
        startActivity(intent);
    }
    public void B3(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.bhimupi.org.in/"));
        startActivity(intent);
    }
    public void B4(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://paytm.com/train-tickets/irctc-account-login"));
        startActivity(intent);
    }
    public void B5(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.phonepe.com/"));
        startActivity(intent);
    }
    public void B6(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://paytm.com/"));
        startActivity(intent);
    }
}