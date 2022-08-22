package com.example.juegointeractivo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class selecciontemas extends AppCompatActivity {
ImageButton botgeografia, botbiologia,botmatematica, botortografia,botseñales, botmedioambiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecciontemas);
        botbiologia= findViewById(R.id.imageButton6);
        botgeografia=findViewById(R.id.imageButton7);
        botmatematica= findViewById(R.id.imageButton8);
        botortografia=findViewById(R.id.imageButton9);
        botseñales= findViewById(R.id.imageButton10);
        botmedioambiente=findViewById(R.id.imageButton15);


    }
}