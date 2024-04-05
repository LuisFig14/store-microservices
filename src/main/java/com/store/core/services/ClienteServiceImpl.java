package com.store.core.services;

import com.store.core.domain.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClienteServiceImpl {

    private List<Cliente> clienteList = new ArrayList<>(Arrays.asList(
       new Cliente("luisito", "1234", "Luis"),
       new Cliente("Lupita", "246", "Guadalupe")
    ));

    public List<Cliente> getClientes() {
        return clienteList;
    }
}
