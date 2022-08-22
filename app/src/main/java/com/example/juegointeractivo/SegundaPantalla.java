package com.example.juegointeractivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class SegundaPantalla extends AppCompatActivity {
    TextView textViewPregunta;
    ImageView imageView;
    Button btn_op1, btn_op2, btn_op3, btn_op4, btn_next;
    Pregunta preguntaActual;
    int numeroPregunta=-1;
    int contadorcorrectas=0;
    int contadorincorrectas=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String tema = getIntent().getExtras().getString("tema");

        textViewPregunta=findViewById(R.id.textView);
        imageView=findViewById(R.id.imageView2);
        btn_op1=findViewById(R.id.buttonop1);
        btn_op2=findViewById(R.id.buttonop2);
        btn_op3=findViewById(R.id.buttonop3);
        btn_op4=findViewById(R.id.buttonop4);
        btn_next=findViewById(R.id.button_next);
        Controller controler = new Controller(this, tema);/************************************************************************************/
        numeroPregunta=0;
        preguntaActual=controler.preguntas.get(numeroPregunta);
        setPregunta();
        btn_op1.setOnClickListener(view -> {
            onClickButton(1,btn_op1);
        });
        btn_op2.setOnClickListener(view -> {
            onClickButton(2,btn_op2);
        });
        btn_op3.setOnClickListener(view -> {
            onClickButton(3,btn_op3);
        });
        btn_op4.setOnClickListener(view -> {
            onClickButton(4,btn_op4);
        });
        btn_next.setOnClickListener(view ->{
            if(numeroPregunta<controler.preguntas.size()-1){
                numeroPregunta++;
                preguntaActual=controler.preguntas.get(numeroPregunta);
                setPregunta();
            }else{
                Intent intent3 = new Intent (SegundaPantalla.this, Resultado.class);
                startActivity(intent3);
            }
        });

    }

    public void setPregunta(){
        btn_next.setVisibility(View.INVISIBLE);
        textViewPregunta.setText(preguntaActual.getPregunta());
        //Picasso.get().load(preguntaActual.getUrlImagen()).into(imageView);
        imageView.setImageDrawable(getDrawable(preguntaActual.drawable));
        btn_op1.setText(preguntaActual.getOpcion1());
        btn_op2.setText(preguntaActual.getOpcion2());
        btn_op3.setText(preguntaActual.getOpcion3());
        btn_op4.setText(preguntaActual.getOpcion4());
        habilitarDeshabilitarTodos(true);
        restaurarColores();
    }


    public void onClickButton (int opcion, Button btn){
        habilitarDeshabilitarTodos(false);
        if (opcion==preguntaActual.opcionCorrecta){
            btn.setBackgroundColor(Color.GREEN);
            contadorcorrectas++;
            contadorincorrectas++;
        }else{
            btn.setBackgroundColor(Color.RED);
        }
        btn_next.setVisibility(View.VISIBLE);

    }
    public void habilitarDeshabilitarTodos(boolean habilitar){
        btn_op1.setEnabled(habilitar);
        btn_op2.setEnabled(habilitar);
        btn_op3.setEnabled(habilitar);
        btn_op4.setEnabled(habilitar);
    }
    public void restaurarColores(){
        btn_op1.setBackgroundColor(getColor(R.color.purple_500));
        btn_op2.setBackgroundColor(getColor(R.color.purple_500));
        btn_op3.setBackgroundColor(getColor(R.color.purple_500));
        btn_op4.setBackgroundColor(getColor(R.color.purple_500));
    }


}
