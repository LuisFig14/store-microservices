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

    public Producto(){

    }

     public Integer getId() {
         return id;
     }

     public String getNombre(){
        return this.nombre;
     }

     public Double getPrecio(){
        return this.precio;
     }

     public Integer getStock(){
        return stock;
     }

     //Setters
    public void setId(){this.id = id; }

    public void setNombre(){this.nombre = nombre; }
    public void setPrecio(){this.precio = precio;}
    public void setStock(){this.stock= stock; }






}
