package com.store.core.services;

import com.store.core.domain.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductoServiceImpl implements ProductService{

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto(1, "TV", 300.0, 2),
            new Producto(2, "Telefono", 100.0, 2))
    );

    public List<Producto> getProductos (){
        return productos;
    }

}
