package com.example.derber_uno_fresh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class mostrardatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrardatos);

        TextView saludo= (TextView)findViewById(R.id.txtmostrar);
        Bundle bundle = this.getIntent().getExtras();


        saludo.setText("Hola!, Bienvenido \n " +
                bundle.getString("nombre") +"\n"
                +bundle.getString("cedula")+"\n"
                +bundle.getString("ciudad")+"\n"
                +bundle.getString("correo")+"\n"
                +bundle.getString("telefono")+"\n"
                +bundle.getString("fecha"));






    }
}