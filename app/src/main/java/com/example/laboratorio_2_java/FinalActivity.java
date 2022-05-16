package com.example.laboratorio_2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Nombre: FinalActivity
 * Estudienate: Néstor David Leiva Mora
 * Laboratorio II
 */


public class FinalActivity extends AppCompatActivity {
    // Method that shows the final activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }

    // Method that shows the activity of returning to the main page
    public void mainView(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}