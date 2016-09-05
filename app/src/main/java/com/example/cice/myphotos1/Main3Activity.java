package com.example.cice.myphotos1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    ImageView imageView;
    Button buttonOK, buttonOUT;
    ArrayList<Integer> cuadrosIds;
    TextView textViewFinal;
    String mensajeFinal = "Quiero uno igual ¡¡¡";




    Integer [] arrayFotoPerros = {R.drawable.perro1, R.drawable.perro2, R.drawable.perro3, R.drawable.perro4};
    Integer [] arrayFotoGatos = {R.drawable.gato1, R.drawable.gato2, R.drawable.gato3, R.drawable.gato4};



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        String intentS = getIntent().getExtras().getString("CAT_SELECTED");

        cuadrosIds = new ArrayList<>();

        if (intentS.equals("Perros"))
        {



            cuadrosIds.add (arrayFotoPerros[0]);
            cuadrosIds.add (arrayFotoPerros[1]);
            cuadrosIds.add (arrayFotoPerros[2]);
            cuadrosIds.add (arrayFotoPerros[3]);





        }else if (intentS.equals("Gatos")){


            cuadrosIds.add (arrayFotoGatos[0]);
            cuadrosIds.add (arrayFotoGatos[1]);
            cuadrosIds.add (arrayFotoGatos[2]);
            cuadrosIds.add (arrayFotoGatos[3]);




        } else {

            cuadrosIds.add (arrayFotoPerros[0]);
            cuadrosIds.add (arrayFotoGatos[0]);
            cuadrosIds.add (arrayFotoPerros[1]);
            cuadrosIds.add (arrayFotoGatos[1]);
            cuadrosIds.add (arrayFotoPerros[2]);
            cuadrosIds.add (arrayFotoGatos[2]);
            cuadrosIds.add (arrayFotoPerros[3]);
            cuadrosIds.add (arrayFotoGatos[3]);



        }


        imageView = (ImageView) findViewById(R.id.image_view);
        imageView.setImageDrawable(getDrawable(cuadrosIds.get(0)));


    }



    int index = 0;

    public void funcion_change(View v){

        index ++;
        if (index > 3) {
            index = 0;
        }

        imageView.setImageDrawable(getDrawable(cuadrosIds.get(index)));
        textViewFinal = (TextView) findViewById(R.id.textview_mensaje);
        textViewFinal.setText("");



    }



    public void funcion_ok(View v){
        textViewFinal = (TextView) findViewById(R.id.textview_mensaje);
        textViewFinal.setText(mensajeFinal);



    }



}
