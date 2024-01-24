package com.example.nastuxa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class masters extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masters);
    }
    public void openMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
