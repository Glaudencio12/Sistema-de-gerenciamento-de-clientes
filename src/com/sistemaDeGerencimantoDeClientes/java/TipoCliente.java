package com.sistemaDeGerencimantoDeClientes.java;

public enum TipoCliente {
    NORMAL("Normal", 1),
    VIP("Vip", 2);

    private String tipo;
    private int id;

    TipoCliente(String tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
}
