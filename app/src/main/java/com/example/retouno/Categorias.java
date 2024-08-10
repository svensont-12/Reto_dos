package com.example.retouno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categorias extends AppCompatActivity {

    private Button button_glass,button_plastic,button_ewaste,button_iron,button_paper,button_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        //Enlazamiento con la GUI
        Button button_glass = findViewById(R.id.button19);
        Button button_plastic = findViewById(R.id.button20);
        Button button_ewaste = findViewById(R.id.button21);
        Button button_iron = findViewById(R.id.button22);
        Button button_paper = findViewById(R.id.button23);
        Button button_volver = findViewById(R.id.button28);

        //Escuchadores de los botones
        button_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irARecicla_glass = new Intent(Categorias.this,Glass.class);
                startActivity(irARecicla_glass);
            }
        });
        button_plastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irARecicla_plastic = new Intent(Categorias.this,Plastico.class);
                startActivity(irARecicla_plastic);
            }
        });
        button_ewaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irARecicla_ewaste = new Intent(Categorias.this,electriwaste.class);
                startActivity(irARecicla_ewaste);
            }
        });
        button_iron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irARecicla_iron = new Intent(Categorias.this,Vidrio.class);
                startActivity(irARecicla_iron);
            }
        });
        button_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irARecicla_papel = new Intent(Categorias.this,Paper.class);
                startActivity(irARecicla_papel);
            }
        });
        button_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent para el cambio de pantalla
                Intent irAPantallaInicio = new Intent(Categorias.this,Principal.class);
                startActivity(irAPantallaInicio);
            }
        });
    }
}