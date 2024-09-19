package com.appdid.allinoneshoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void Card1(View view) {
        Intent abc = new Intent(MainActivity2.this, shopping.class);
        startActivity(abc);
    }
    public void Card2(View view) {
        Intent intent = new Intent(MainActivity2.this,Entertainment.class);
        startActivity(intent);
    }
    public void Card3(View view) {
        Intent intent = new Intent(MainActivity2.this,Billpay.class);
        startActivity(intent);
    }
    public void Card4(View view) {
        Intent intent = new Intent(MainActivity2.this,food.class);
        startActivity(intent);
    }
    public void Card5(View view) {
        Intent intent = new Intent(MainActivity2.this,cabs.class);
        startActivity(intent);
    }
    public void onBackPressed() {
        {
            final AlertDialog.Builder builder;
            builder = new AlertDialog.Builder(MainActivity2.this);
            builder.setMessage("Are You Want To Close?");
            builder.setCancelable(true);
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }
}


