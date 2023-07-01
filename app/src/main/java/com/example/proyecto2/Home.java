package com.example.proyecto2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

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
        botonhoteles = findViewById(R.id.botonh);
        botonrestaurantes = findViewById(R.id.botonrestaurante);
        botonsitios = findViewById(R.id.botont);
        //escuchando los eventos del click del boton
        botonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el home cuando le hacemos click al boton
                Intent intent = new Intent(Home.this, Hoteles.class);
                startActivity(intent);
            }
        });
        botonrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el home cuando le hacemos click al boton
                Intent intent2 = new Intent(Home.this, Restaurantes.class);
                startActivity(intent2);
            }
        });
        botonsitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el home cuando le hacemos click al boton
                Intent intent3 = new Intent(Home.this, Sitios.class);
                startActivity(intent3);
            }
        });
    }


    //metodo para cambiar el idioma de mi app
    public void cambiarIdioma(String idioma){

        //configurando el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configracion global en el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }


    //Cargar el menu xml creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }


    //DAR funcionamiento al menu
    public boolean onOptionsItemSelected(MenuItem item) {

        //observamos a que item del menu le damos clic
        int itemSeleccionado=item.getItemId();

        switch(itemSeleccionado){

            case(R.id.opcion1):
                this.cambiarIdioma("es");
                Intent intent1=new Intent(Home.this,Home.class);
                startActivity(intent1);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("en");
                Intent intent2=new Intent(Home.this,Home.class);
                startActivity(intent2);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("it");
                Intent intent3=new Intent(Home.this,Home.class);
                startActivity(intent3);
                break;
            case(R.id.opcion4):
                Toast.makeText(this, "acerca de", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}