package com.example.juegointeractivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonJugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonJugar=findViewById(R.id.button);
        buttonJugar.setOnClickListener(v->{
            Intent intent2=new Intent(MainActivity.this, selecciontemas.class);
            startActivity(intent2);
        });
    }
}