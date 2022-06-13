package com.example.applistaproductos;
//Clase POJO
public class Producto {
    private  int id;
    private String denominacion;
    private String categoria;
    private float precio;
    private String marca;
    private int tamanio;
    private float peso;
    private String detalle;

    public Producto(String denominacion, String categoria, float precio, String marca, int tamanio, float peso, String detalle) {
        this.denominacion = denominacion;
        this.categoria = categoria;
        this.precio = precio;
        this.marca = marca;
        this.tamanio = tamanio;
        this.peso = peso;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public float getPeso() {
        return peso;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n"+"Productos{" +
                "id=" + id +
                ", denominacion='" + denominacion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                ", peso=" + peso +
                ", detalle='" + detalle + '\'' +
                '}';
    }

}
