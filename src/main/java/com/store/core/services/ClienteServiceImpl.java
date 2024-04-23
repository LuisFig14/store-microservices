package com.store.core.services;

import com.store.core.domain.Cliente;
import com.store.core.domain.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private List<Cliente> clienteList = new ArrayList<>(Arrays.asList(
       new Cliente("louis", "1234", "Luis"),
       new Cliente("Johan", "246", "Mark")
    ));

    @Override
    public List<Cliente> getClientes() {
        return clienteList;
    }

}
