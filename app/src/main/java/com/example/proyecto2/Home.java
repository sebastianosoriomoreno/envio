package com.example.proyecto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE ATRIBUTOS
    Button botonhoteles;
    Button botonrestaurantes;
    Button botonsitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //asociando los atributos de tipo boton a los id que pusimos en xml
        botonhoteles=findViewById(R.id.botonh);
        botonrestaurantes=findViewById(R.id.botonrestaurante);
        botonsitios=findViewById(R.id.botont);
        //escuchando los eventos del click del boton
        botonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el home cuando le hacemos click al boton
                Intent intent= new Intent(Home.this,Hoteles.class);
                startActivity(intent);
            }
        });
        botonrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el home cuando le hacemos click al boton
                Intent intent2= new Intent(Home.this,Restaurantes.class);
                startActivity(intent2);
            }
        });
        botonsitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el home cuando le hacemos click al boton
                Intent intent3= new Intent(Home.this,Sitios.class);
                startActivity(intent3);
            }
        });
    }
}