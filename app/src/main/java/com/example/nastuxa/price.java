package com.example.nastuxa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class price extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price);
    }
    public void openMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
