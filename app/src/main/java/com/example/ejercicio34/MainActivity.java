package com.example.ejercicio34;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = findViewById(R.id.boton_suma);
        EditText primer_numero = findViewById(R.id.primer_numero);
        EditText segundo_numero = findViewById(R.id.editTextTextPersonName4);
        TextView resultado = findViewById(R.id.textView3);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            resultado.setText("El resultado es: "+suma(primer_numero.getText().toString(),segundo_numero.getText().toString()));

            }
        });

    }

    public int suma(String a, String b){
        int primero =Integer.parseInt(a);
        int segundo = Integer.parseInt(b);
        int suma = primero+segundo;
        return suma;
    }
}