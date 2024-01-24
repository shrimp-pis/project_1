package com.example.nastuxa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class o_pril extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.o_pril);
    }
    public void openMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
