package com.example.applistaproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.applistaproductos.databinding.ActivityListaBinding;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {
    private ArrayList<Producto> productos;
    private ActivityListaBinding bindingLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        incialiazar();
        popularListaProductos();

            desplegarScroll();

    }
    //No se puedo realizar :(
    private void desplegarScroll() {
        bindingLista.txtProductos.setText(productos.toString());
    }

    private void popularListaProductos() {
        String denom,cat,marca,detalle;
        int id,tam;
        int conId =0;
        float precio,peso;
        Producto proc1 = new Producto("Coca-cola","Bebidas",13.0f,"Coca-cola Company",10,3.0f,"Ninguno");
        Producto proc2 = new Producto("Fanta","Bebidas",11.0f,"Coca-cola Company",10,3.0f,"Ninguno");
        Producto proc3 = new Producto("Sprite","Bebidas",11.0f,"Coca-cola Company",10,3.0f,"Ninguno");
        Producto proc4 = new Producto("Papas lay","Comestibles",5.0f,"Fritolay",10,1.0f,"Ninguno");
        Producto proc5 = new Producto("Atún","Productos no perecederos",3.0f,"Maritimo",10,5.0f,"Ninguno");
        Producto proc6 = new Producto("Mantequilla","Comestibles",5.0f,"Regia",10,5.0f,"Ninguno");
        Producto proc7 = new Producto("Leche","Lacteos",6.0f,"Pil",10,500.0f,"Ninguno");
        proc1.setId(1);
        proc2.setId(2);
        proc3.setId(3);
        proc4.setId(4);
        proc5.setId(5);
        proc6.setId(6);
        proc7.setId(7);
        productos.add(proc1);
        productos.add(proc2);
        productos.add(proc3);
        productos.add(proc4);
        productos.add(proc5);
        productos.add(proc6);
        productos.add(proc7);
    }

    private void incialiazar() {
        productos = new ArrayList<Producto>(7);
        bindingLista = ActivityListaBinding.inflate(getLayoutInflater());
        setContentView(bindingLista.getRoot());
    }
}