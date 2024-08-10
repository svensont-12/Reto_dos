package com.example.retouno;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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