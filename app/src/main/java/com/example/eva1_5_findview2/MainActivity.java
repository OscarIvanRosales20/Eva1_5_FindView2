package com.example.eva1_5_findview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgVwMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tiene que ser despues del SETCONTENTVIEW
        imgVwMostrar = findViewById(R.id.imgVwMostrar); //Busca el id del widget y se lo agrega a la variable
        imgVwMostrar.setImageResource(R.drawable.kk); //Agregar a la variable una imagen la cual se busca el id en drawable

        /*
        RECURSOS EN PROYECTO DE ANDROID
        1.- Nombre: minusculas, sin espacios, caracteres especiales.
         */
    }
}