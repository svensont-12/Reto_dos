package com.example.retouno;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Consejos extends AppCompatActivity {
    private Button buttonVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);

        //GUI
        Button buttonVolver = findViewById(R.id.button24);

        //Escuchador
        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent del cambio de pantalla
                Intent irAPrincipal = new Intent(Consejos.this,Principal.class);
                startActivity(irAPrincipal);
            }
        });
    }
}