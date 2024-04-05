package com.store.core.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.core.domain.Producto;

import java.io.IOException;
import java.util.List;

public class ProductServiceJSONImpl implements ProductService {

    @Override
    public List<Producto> getProductos() {
        List<Producto> productos;

        try {
            productos = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/productos.json"),
                            new TypeReference<List<Producto>>() {});
                    return productos;

        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
