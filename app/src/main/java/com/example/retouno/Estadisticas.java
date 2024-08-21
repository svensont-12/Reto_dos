package com.example.retouno;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class Estadisticas extends AppCompatActivity {

    private TextView reciclaVidrio1, reciclaVidrio2, reciclaVidrio3, reciclaVidrio4, reciclaVidrio5, reciclaVidrio6, reciclaVidrio7;
    private TextView reciclaPlastico1, reciclaPlastico2, reciclaPlastico3, reciclaPlastico4, reciclaPlastico5, reciclaPlastico6, reciclaPlastico7;
    private TextView reciclaelectric1, reciclaelectric2, reciclaelectric3, reciclaelectric4, reciclaelectric5, reciclaelectric6, reciclaelectric7;
    private TextView reciclametal1, reciclametal2, reciclametal3, reciclametal4, reciclametal5, reciclametal6, reciclametal7;
    private TextView reciclapapel1, reciclapapel2, reciclapapel3, reciclapapel4, reciclapapel5, reciclapapel6, reciclapapel7;
    private Button buttonVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

        //Obtener referencia a la GUI
        Button buttonVolver = findViewById(R.id.button26);

        //Enlazar los resultados de recicla vidrio
        TextView reciclaVidrio1= findViewById(R.id.textView6);
        TextView reciclaVidrio2= findViewById(R.id.textView7);
        TextView reciclaVidrio3= findViewById(R.id.textView8);
        TextView reciclaVidrio4= findViewById(R.id.textView9);
        TextView reciclaVidrio5= findViewById(R.id.textView10);
        TextView reciclaVidrio6= findViewById(R.id.textView11);
        TextView reciclaVidrio7= findViewById(R.id.textView12);

        //Enlazar los resultados de recicla plastico
        TextView reciclaplastico1=findViewById(R.id.textView14);
        TextView reciclaplastico2=findViewById(R.id.textView15);
        TextView reciclaplastico3=findViewById(R.id.textView16);
        TextView reciclaplastico4=findViewById(R.id.textView17);
        TextView reciclaplastico5=findViewById(R.id.textView18);
        TextView reciclaplastico6=findViewById(R.id.textView19);
        TextView reciclaplastico7=findViewById(R.id.textView20);

        //Enlazar los resultados de recicla e_waste
        TextView reciclaelectric1=findViewById(R.id.textView13);
        TextView reciclaelectric2=findViewById(R.id.textView21);
        TextView reciclaelectric3=findViewById(R.id.textView22);
        TextView reciclaelectric4=findViewById(R.id.textView23);
        TextView reciclaelectric5=findViewById(R.id.textView24);
        TextView reciclaelectric6=findViewById(R.id.textView25);
        TextView reciclaelectric7=findViewById(R.id.textView26);

        //Enlazar los resultados de recicla metal
        TextView reciclametal1=findViewById(R.id.textView27);
        TextView reciclametal2=findViewById(R.id.textView28);
        TextView reciclametal3=findViewById(R.id.textView29);
        TextView reciclametal4=findViewById(R.id.textView30);
        TextView reciclametal5=findViewById(R.id.textView31);
        TextView reciclametal6=findViewById(R.id.textView32);
        TextView reciclametal7=findViewById(R.id.textView33);

        //Enlazar los resultados de recicla papel
        TextView reciclapapel1=findViewById(R.id.textView34);
        TextView reciclapapel2=findViewById(R.id.textView35);
        TextView reciclapapel3=findViewById(R.id.textView36);
        TextView reciclapapel4=findViewById(R.id.textView37);
        TextView reciclapapel5=findViewById(R.id.textView38);
        TextView reciclapapel6=findViewById(R.id.textView39);
        TextView reciclapapel7=findViewById(R.id.textView40);

        //Recepcion de datos de las demas pantallas

            //Datos provenientes de la categoria vidrio

                //Recuperar los datos del color del vidrio
                SharedPreferences sharedPreferencesVidrio = getSharedPreferences("Vidrio", MODE_PRIVATE);
                String spinnerSelection = sharedPreferencesVidrio.getString("spinner_selection", "Blanco");

                //Recuperar el decimal de lo registrado con intent
                Intent intent_vidrio = getIntent();
                double decimalValue = intent_vidrio.getDoubleExtra("decimal_value", 0.0);

                //Mostrar los resultados
                String displayText = "Color: "+spinnerSelection+"\n"
                                    +"Peso: "+decimalValue+"\n";
                reciclaVidrio1.setText(displayText);

            //Datos provenientes de la categoria plastico
                //Recuperar los textos desde SharedPreferences
                SharedPreferences sharedPreferencesPlastico = getSharedPreferences("Plasticos", MODE_PRIVATE);
                String plastico1 = sharedPreferencesPlastico.getString("text1", "Default Value 1");
                String plastico2 = sharedPreferencesPlastico.getString("text2", "Default Value 2");
                String plastico3 = sharedPreferencesPlastico.getString("text3", "Default Value 3");

                //Mostrarlos en el GridLayout
                reciclaplastico1.setText(plastico1);
                reciclaplastico2.setText(plastico2);
                reciclaplastico3.setText(plastico3);

            //Datos provenientes de la categoria e-waste
                // Recuperar datos de SharedPreferences
                SharedPreferences sharedPreferencesEwaste = getSharedPreferences("Electro", MODE_PRIVATE);
                String componenteSeleccionado = sharedPreferencesEwaste.getString("componente_seleccionado", "No Seleccionado");
                String tipoPilaSeleccionado = sharedPreferencesEwaste.getString("tipo_pila_seleccionado", "No Seleccionado");
                int integerValue = sharedPreferencesEwaste.getInt("integer_value", 0);

                // GUI
                    //textViewComponente = findViewById(R.id.text_view_componente);
                    //textViewTipoPila = findViewById(R.id.text_view_tipo_pila);
                    //textViewInteger = findViewById(R.id.text_view_integer);
                //Mostrarlos en algun lado
                    reciclaelectric1.setText("Componente: " + componenteSeleccionado);
                    reciclaelectric2.setText("Tipo de Pila: " + tipoPilaSeleccionado);
                    reciclaelectric3.setText("Entero: " + integerValue);

            //Datos provenientes de la categoria metal
                    // Recuperar los ArrayList enviados
                    ArrayList<String> arrayList1 = getIntent().getStringArrayListExtra("arrayList1");
                    ArrayList<String> arrayList2 = getIntent().getStringArrayListExtra("arrayList2");
                    ArrayList<String> arrayList3 = getIntent().getStringArrayListExtra("arrayList3");
                    ArrayList<String> arrayList4 = getIntent().getStringArrayListExtra("arrayList4");

                    // Mostrar los primeros elementos de cada ArrayList
                    reciclametal1.setText(arrayList1.get(0));
                    reciclametal2.setText(arrayList2.get(0));
                    reciclametal3.setText(arrayList3.get(0));
                    reciclametal4.setText(arrayList4.get(0));

            //Datos provenientes de la categoria papel
                // Obtener el Intent que lanzó esta actividad
                    Intent intent_papel = getIntent();

                // Recuperar el ArrayList enviado con los datos de recicla papel
                    ArrayList<String> recicla_paper = intent_papel.getStringArrayListExtra("Paper_LIST");

                //Mostrar los datos al usuario
                if (recicla_paper != null && recicla_paper.size() >= 3) {
                    // Mostrar los datos en los TextView
                    reciclapapel1.setText(recicla_paper.get(0));
                    reciclapapel2.setText(recicla_paper.get(1));
                    reciclapapel3.setText(recicla_paper.get(2));
                }
        //Escuchador
        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent del cambio de pantalla
                Intent irAPrincipal = new Intent(Estadisticas.this,Principal.class);
                startActivity(irAPrincipal);
            }
        });
    }
}