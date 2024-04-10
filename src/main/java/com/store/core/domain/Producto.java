package com.store.core.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    //Attributes
    private Integer id;
    private String nombre;
    private Double precio;
    private Integer stock;

}
