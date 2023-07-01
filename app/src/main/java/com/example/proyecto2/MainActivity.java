package com.example.proyecto2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

//cuando algo empieza en mayuscula es una clase y el objeto es cuando esta escrito en minuscula
public class MainActivity extends AppCompatActivity {

    // aqui vamos a poner los atributos y variables
    MediaPlayer cancion;



    @Override //metodos
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancion= MediaPlayer.create(this, R.raw.audio1);
        cancion.start();

        // temporizar el lanzamiento de la cancion
        TimerTask inicio=new TimerTask() {
            @Override
            public void run() {
                Intent intent= new  Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        };

        Timer tiempo= new Timer();
        tiempo.schedule(inicio,15000);


    }
}