package com.example.derber_uno_fresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void limpiar (View view) {
        EditText nombre = (EditText)findViewById(R.id.txtnombre);
        EditText cedula = (EditText)findViewById(R.id.txtcedula);
        EditText ciudad = (EditText)findViewById(R.id.txtciudad);
        EditText correo = (EditText)findViewById(R.id.txtcorreo);
        EditText telefono = (EditText)findViewById(R.id.txttelefono);
        EditText fecha = (EditText)findViewById(R.id.txtfecha);

        nombre.setText("");
        cedula.setText("");
        ciudad.setText("");
        correo.setText("");
        telefono.setText("");
        fecha.setText("");

    }

    public void guardar (View view) {
        EditText nombre = (EditText)findViewById(R.id.txtnombre);
        EditText cedula = (EditText)findViewById(R.id.txtcedula);
        EditText ciudad = (EditText)findViewById(R.id.txtciudad);
        EditText correo = (EditText)findViewById(R.id.txtcorreo);
        EditText telefono = (EditText)findViewById(R.id.txttelefono);
        EditText fecha = (EditText)findViewById(R.id.txtfecha);
        String Nombre, Cedula, Ciudad, Correo, Telefono, Fecha;

        Nombre = nombre.getText().toString();
        Cedula = cedula.getText().toString();
        Ciudad = ciudad.getText().toString();
        Correo = correo.getText().toString();
        Telefono = telefono.getText().toString();
        Fecha = fecha.getText().toString();

        Intent intent = new Intent(MainActivity.this, mostrardatos.class);
        Bundle envio = new Bundle();

        envio.putString("nombre", Nombre);
        envio.putString("cedula", Cedula);
        envio.putString("ciudad", Ciudad);
        envio.putString("correo", Correo);
        envio.putString("telefono", Telefono);
        envio.putString("fecha", Fecha);
        intent.putExtras(envio);
        startActivity(intent);


    }







}