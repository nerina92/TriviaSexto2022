package com.example.juegointeractivo;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class TerceraPantalla extends AppCompatActivity {
    int correctas;
    int incorrectas;
    Button vjugar;
    TextView Rcorrectas;
    TextView Rincorrectas;
    TextView Rcnum;
    TextView Rinnum;
    ImageView Rcima;
    ImageView Rinima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        vjugar = findViewById(R.id.vjugar);
        Rcorrectas = findViewById(R.id.Rcorrectas);
        Rincorrectas = findViewById(R.id.Rincorrectas);
        Rcnum = findViewById(R.id.Rcnum);
        Rinnum = findViewById(R.id.Rinnum);
        Rcima = findViewById(R.id.Rcima);
        Rinima = findViewById(R.id.Rinima);

        if (savedInstanceState == null) {

            Bundle extras = getIntent().getExtras();

            if(extras == null) {

                correctas= 0;
                incorrectas= 0;


            } else {

                correctas= extras.getInt("correctas");
                incorrectas= extras.getInt("incorrectas");
            }

        } else {

            correctas= (int) savedInstanceState.getSerializable("correctas");
            incorrectas= (int) savedInstanceState.getSerializable("incorrectas");

        }
        Rcnum.setText(""+correctas);
        Rcnum.setTextColor(Color.GREEN);

        Rinnum.setText(""+incorrectas);
        Rinnum.setTextColor(Color.RED);
        String imagecorrecta;
        String imagenincorrecta;
        imagecorrecta = "https://media.discordapp.net/attachments/970748327568224289/981148778948075530/imagen_1_1492441376.png";
        imagenincorrecta = "https://media.discordapp.net/attachments/970748327568224289/981148779313000508/incorrect-294245_960_720.webp?width=697&height=618";
        Picasso.get().load(imagecorrecta).into(Rcima);
        Picasso.get().load(imagenincorrecta).into(Rinima);
        vjugar.setOnClickListener(view->{
            Intent intent4=new Intent(TerceraPantalla.this,MainActivity.class);
            startActivity(intent4);
        });

    }
}
