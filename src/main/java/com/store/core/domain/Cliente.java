package com.store.core.domain;


public class Cliente {

    //Attributes
    private String username;
    private String password;
    private String nombre;


    //Constructor
    public Cliente (String username, String password, String nombre){
        this.username = username;
        this.password = password;
        this.nombre = nombre;
    }


    //getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
