package com.example.juegointeractivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Intent intent2=new Intent(selecciontemas.this, SegundaPantalla.class);


        botbiologia.setOnClickListener(view -> {
            intent2.putExtra("tema", "biologia");
            startActivity(intent2);
        });
        botgeografia.setOnClickListener(view -> {
            intent2.putExtra("tema", "geografía");
            startActivity(intent2);
        });
        botmatematica.setOnClickListener(view -> {
            intent2.putExtra("tema", "matemática");
            startActivity(intent2);
        });
        botortografia.setOnClickListener(view -> {
            intent2.putExtra("tema", "otografia");
            startActivity(intent2);
        });
        botseñales.setOnClickListener(view -> {
            intent2.putExtra("tema", "señales");
            startActivity(intent2);
        });
        botmedioambiente.setOnClickListener(view -> {
            intent2.putExtra("tema", "medio ambiente");
            startActivity(intent2);
        });

    }
}