package com.example.cice.myphotos1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Menu2Activity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);



        // configurar el spinner con tres categorías: gatos, perros, gatos y perros
        // al elegir una categoría, poner en el spinner el nombre de esa categoría

        ArrayList<String> opcionesSpinner = new ArrayList<>();
        opcionesSpinner.add(" ");
        opcionesSpinner.add("Perros");
        opcionesSpinner.add("Gatos");
        opcionesSpinner.add("Perros y Gatos");

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_dropdown_item,opcionesSpinner);

        spinner.setAdapter(adapter);
    }


    public void funcion_buscar (View v){

        String categoria_seleccionada = spinner.getSelectedItem().toString();
        Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
        intent.putExtra("CAT_SELECTED",categoria_seleccionada);
        startActivity(intent);


    }


}
