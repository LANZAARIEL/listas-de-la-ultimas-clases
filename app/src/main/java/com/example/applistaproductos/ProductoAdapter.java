package com.example.applistaproductos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.recyclerview.widget.RecyclerView;

import com.example.applistaproductos.databinding.ProductoItemBinding;

import java.util.ArrayList;

public class ProductoAdapter extends BaseAdapter {
    //Atributos esenciales
    private ArrayList<Producto> productos;
    private int layout;
    private Context contexto;

    public ProductoAdapter(ArrayList<Producto> productos, int layout, Context contexto) {
        this.productos = productos;
        this.layout = layout;
        this.contexto = contexto;
    }

    //Reglas del juego
    @Override
    public int getCount() {

        return productos.size();
    }

    @Override
    public Object getItem(int position) {

        return productos.get(position);
    }
    // configura la clas padre
    @Override
    public long getItemId(int id) {

        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        return null;
    }
    //configurar el àtron view holder
    //integrar una clase interna
    public static class viewHolder{
        private ProductoItemBinding biding;
        private View view;
        public ViewHolder(ProductoItemBinding binding){
            this.biding
        }
    }

}
