package com.example.nastuxa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openPrice(View v) {
        Intent intent = new Intent(this, price.class);
        startActivity(intent);
    }
    public void openMasters(View v) {
        Intent intent = new Intent(this, masters.class);
        startActivity(intent);
    }
    public void openO_pril(View v) {
        Intent intent = new Intent(this, o_pril.class);
        startActivity(intent);
    }
    public void openZapis(View v) {
        Intent intent = new Intent(this, zapis.class);
        startActivity(intent);
    }
}