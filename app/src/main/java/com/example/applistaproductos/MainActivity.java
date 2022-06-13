package com.example.applistaproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.applistaproductos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Si Binding esta habilitado se crea una clase que tiene el mapeo de referencia de su Layout asociado a la vista
    //Se crea una clase Binding por cada layout creado
    //que ya tiene refencias a todos los views, la clase se crea tomando el nombre del layout en formato camel case terminado en la palabra Binding
    private ActivityMainBinding bindingDatos;
    //Debemos referenciar la variable bindingDatos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: no usamos una clase R con binding setContentView(R.layout.activity_main);
        //Inicializar binding para asociarlo a su layout
        bindingDatos = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bindingDatos.getRoot()); //Seteamos el layout actual
        bindingDatos.btnProcesar.setOnClickListener(view -> {
            String nombre = bindingDatos.etNombre.getText().toString();
            bindingDatos.txtResultado.setText(nombre);
        });
    }
}