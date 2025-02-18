package com.sistemaDeGerencimantoDeClientes.java;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cpf;
    protected Endereco endereco;
    private String telefone;
    private TipoCliente tipoCliente;
    private LocalDate dataCadastro;

    public Cliente(String nome, Endereco endereco, String cpf, String telefone, TipoCliente tipoCliente, LocalDate dataCadastro) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.tipoCliente = tipoCliente;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Informações do cliente: " + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                endereco.toString() + "\n" +
                "Telefone: " + telefone + "\n" +
                "Tipo de cadastro do cliente: " + tipoCliente + "\n" +
                "Data de cadastro: " + dataCadastro + "\n";
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
