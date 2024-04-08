package com.store.core.services;

import com.store.core.domain.Cliente;
import com.store.core.domain.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private List<Cliente> clienteList = new ArrayList<>(Arrays.asList(
       new Cliente("luisito", "1234", "Luis"),
       new Cliente("Lupita", "246", "Guadalupe")
    ));

    @Override
    public List<Cliente> getClientes() {
        return clienteList;
    }

}
