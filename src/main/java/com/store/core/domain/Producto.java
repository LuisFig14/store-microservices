package com.store.core.domain;


public class Producto {

    //Attributes
    private Integer id;
    private String nombre;
    private Double precio;
    private Integer stock;


    //Constructor
    public Producto(Integer id, String nombre, Double precio, Integer stock){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

     public Integer getId() {
         return id;
     }

     public String getNombre(){
        return this.nombre;
     }

}
