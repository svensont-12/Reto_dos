package com.example.retouno;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button buttonCategorias,buttonEstadisticas,buttonConsejos,buttonCerrarsesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Enlazamiento con la GUI
        Button buttonCategorias = findViewById(R.id.button5);
        Button buttonEstadisticas = findViewById(R.id.button6);
        Button buttonConsejos = findViewById(R.id.button7);
        Button buttonCerrarsesion = findViewById(R.id.button8);

        //Escuchadores de los botones
            //Boton que lleva a las cinco categorias de reciclaje
            buttonCategorias.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Cambio de pantalla
                    Intent irAPantallaCategorias = new Intent(Principal.this,Categorias.class);
                    startActivity(irAPantallaCategorias);
                }
            });
            //Boton que lleva a las estadisticas de reciclaje
            buttonEstadisticas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Cambio de pantalla
                    Intent irAPantallaEstadisticas = new Intent(Principal.this,Estadisticas.class);
                    startActivity(irAPantallaEstadisticas);
                }
            });
            //Boton que lleva a los consejos
            buttonConsejos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Cambio de pantalla
                    Intent irAPantallaConsejos = new Intent(Principal.this,Consejos.class);
                    startActivity(irAPantallaConsejos);
                }
            });
            //Boton que cierra la sesion y lo devuelve a la primera pantalla
            buttonCerrarsesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Cambio de pantalla
                    Intent irAPantallaInicio = new Intent(Principal.this,MainActivity.class);
                    startActivity(irAPantallaInicio);
                }
            });
    }
}