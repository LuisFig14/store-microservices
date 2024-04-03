package com.store.core.controller;

import com.store.core.domain.Producto;
import com.store.core.services.ProductService;
import com.store.core.services.ProductoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    private ProductService productService = new ProductService() {
        @Override
        public List<Producto> getProductos() {
            return null;
        }
    };

    /**
    @GetMapping
    public ResponseEntity<?> getProducto(){
        List<Producto> productos = productoService.getProductos();
        return ResponseEntity.ok(productos);
    }**/


}
