package com.store.core.controller;

import com.store.core.domain.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    private List<Cliente> clientes = new ArrayList<>(Arrays.asList(
            new Cliente("arm", "1234", "Armstrong"),
            new Cliente("ald", "1234", "Aldrin"),
            new Cliente("col", "1234", "Collins")
    ));



    @GetMapping
    public ResponseEntity<?> getClientes(){ //Método para obtener todos los clientes con wildCard(comodín) en response entity
        return ResponseEntity.ok(clientes); //return ok de clientes
    }

    @GetMapping("/{username}") //Método para obtener un cliente a base de su nombre de usuario
    public ResponseEntity<?> getCliente(@PathVariable String username){
        return ResponseEntity.ok(clientes.stream().
                filter(cliente -> cliente.getUsername().equalsIgnoreCase(username))
                .findFirst().orElseThrow());
    }

    @PostMapping
    public ResponseEntity<?> altaCliente(@RequestBody Cliente cliente){
        clientes.add(cliente);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{userName}")
                .buildAndExpand(cliente.getUsername())
                .toUri();

        return ResponseEntity.created(location).body(cliente);
    }
    @PutMapping
    public ResponseEntity<?> actualizaCliente(@RequestBody Cliente cliente){

        Cliente clienteEncontrado = clientes.stream().
                filter(cli -> cli.getUsername().equalsIgnoreCase(cliente.getUsername())).
                findFirst().orElseThrow();

        clienteEncontrado.setPassword(cliente.getPassword());
        clienteEncontrado.setNombre(cliente.getNombre());

        return ResponseEntity.ok(clienteEncontrado);
    }
    @DeleteMapping("/{userName}")
    public ResponseEntity eliminaCliente(@PathVariable String userName){

        Cliente clienteEliminado = clientes.stream().
                filter(cli-> cli.getUsername().equalsIgnoreCase(userName)).
                findFirst().orElseThrow();

        clientes.remove(clienteEliminado);

        return ResponseEntity.noContent().build();

    }


}
