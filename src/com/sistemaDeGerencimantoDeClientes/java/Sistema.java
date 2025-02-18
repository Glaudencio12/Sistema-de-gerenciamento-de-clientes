package com.sistemaDeGerencimantoDeClientes.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Cliente> clientesList;

    {
        clientesList = new ArrayList<>();
    }

    public Sistema() {
    }

    public void cadastrarCliente(Cliente cliente) {
        clientesList.add(cliente);
        System.out.println("Cadastro realizado com sucesso!");
    }

    public void cadastrarCliente(Cliente... nClientes) {
        for (Cliente cliente : nClientes) {
            clientesList.add(cliente);
        }
        System.out.println("Cadastro realizado com sucesso!");
    }

    public void alterarDadosCliente(String cpf) {
        Scanner scanner = new Scanner(System.in);
        for (Cliente cliente : clientesList) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.print("Qual dado deseja alterar? ");
                String dado = scanner.nextLine();

                switch (dado.toLowerCase()) {
                    case "nome":
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();
                        cliente.setNome(novoNome);
                        System.out.println("-".repeat(30));
                        System.out.println("Dado alterado com sucesso!");
                        System.out.println("-".repeat(30));
                        break;

                    case "cpf":
                        System.out.print("Digite o novo cpf: ");
                        String novoCpf = scanner.nextLine();
                        cliente.setCpf(novoCpf);
                        System.out.println("-".repeat(30));
                        System.out.println("Dado alterado com sucesso!");
                        System.out.println("-".repeat(30));
                        break;

                    case "telefone":
                        System.out.print("Digite o novo telefone: ");
                        String novoTelefone = scanner.nextLine();
                        cliente.setTelefone(novoTelefone);
                        System.out.println("-".repeat(30));
                        System.out.println("Dado alterado com sucesso!");
                        System.out.println("-".repeat(30));
                        break;

                    case "tipo":
                        System.out.print("Digite o novo tipo (digite Normal ou Vip): ");
                        String novoTipo = scanner.nextLine();
                        for (TipoCliente tipo : TipoCliente.values()) {
                            if (novoTipo.equals(tipo.getTipo())) {
                                cliente.setTipoCliente(tipo);
                                System.out.println("-".repeat(30));
                                System.out.println("Dado alterado com sucesso!");
                                System.out.println("-".repeat(30));
                            }
                        }
                        System.out.println("-".repeat(30));
                        System.out.println("Tipo não encontrado");
                        System.out.println("-".repeat(30));
                        break;

                    case "endereço":
                        System.out.print("Bairro: ");
                        String novoBairro = scanner.nextLine();
                        cliente.endereco.setBairro(novoBairro);

                        System.out.print("Rua: ");
                        String novaRua = scanner.nextLine();
                        cliente.endereco.setRua(novaRua);

                        System.out.print("Número: ");
                        String novoNumero = scanner.nextLine();
                        cliente.endereco.setNumero(novoNumero);

                        System.out.print("CEP: ");
                        String novoCep = scanner.nextLine();
                        cliente.endereco.setCep(novoCep);
                        System.out.println("-".repeat(30));
                        System.out.println("Dados alterados com sucesso!");
                        System.out.println("-".repeat(30));
                        break;

                    default:
                        System.out.println("Opção incorreta, tente novamente");
                        break;
                }
            } else {
                System.out.println("Cliente não encontrado!, tente novamente.");
            }
        }
    }

    public void excluirCliente(String cpf) {
        clientesList.removeIf(cliente -> cliente.getCpf().equals(cpf));
        System.out.println("Cliente excluído com sucesso!");
    }

    public String consultarCliente(String dadoCliente) {
        for (Cliente cliente : clientesList) {
            if (cliente.getCpf().equals(dadoCliente) || cliente.getNome().equals(dadoCliente)) {
                return cliente.toString();
            }
        }
        return "Cliente não encontrado";
    }

}