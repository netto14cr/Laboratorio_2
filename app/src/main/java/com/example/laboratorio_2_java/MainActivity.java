package com.example.laboratorio_2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.text_message);
        Intent intent = new Intent(this, MessageActivty.class);
        intent.putExtra("Message",  editText.getText().toString());
        startActivity(intent);
    }
}