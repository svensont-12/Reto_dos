package com.example.retouno;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Estadisticas extends AppCompatActivity {

    private Button buttonVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

        //GUI
        Button buttonVolver = findViewById(R.id.button26);

        //Escuchador
        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent del cambio de pantalla
                Intent irAPrincipal = new Intent(Estadisticas.this,Principal.class);
                startActivity(irAPrincipal);
            }
        });

        //Recepcion de informacion de las demas pantallas

            //Datos provenientes de la categoria vidrio

            //Datos provenientes de la categoria plastico

            //Datos provenientes de la categoria e-waste

            //Datos provenientes de la categoria metal

            //Datos provenientes de la categoria papel
                // Obtener el Intent que lanzó esta actividad
                    Intent intent = getIntent();

                // Recuperar el ArrayList enviado con los datos de recicla papel
                    ArrayList<String> recicla_paper = intent.getStringArrayListExtra("DATA_LIST");

                //Mostrar los datos al usuario
                if (recicla_paper != null && recicla_paper.size() >= 3) {
                    // Mostrar los datos en los TextView
                    //textView1.setText(recicla_paper.get(0));
                    //textView2.setText(recicla_paper.get(1));
                    //textView3.setText(Reecicla_paper.get(2));
                }
    }
}