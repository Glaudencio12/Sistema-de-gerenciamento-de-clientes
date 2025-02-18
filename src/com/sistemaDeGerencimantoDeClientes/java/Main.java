package com.sistemaDeGerencimantoDeClientes.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================= MENU ===================");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Alterar Dados do Cliente");
            System.out.println("3. Excluir Cliente");
            System.out.println("4. Consultar Cliente");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            System.out.println("-".repeat(30));

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine().trim();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine().trim();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine().trim();

                    System.out.print("Tipo do cliente (Vip ou Normal): ");
                    String tipoDigitado = scanner.nextLine().trim();
                    TipoCliente tipo = null;
                    for (TipoCliente tipoEnum : TipoCliente.values()){
                        if (tipoEnum.getTipo().equals(tipoDigitado)) {
                            tipo = tipoEnum;
                        }
                    }

                    LocalDate dataCadastro = LocalDate.now();

                    System.out.print("Bairro: ");
                    String bairro = scanner.nextLine().trim();

                    System.out.print("Rua: ");
                    String rua = scanner.nextLine().trim();

                    System.out.print("Número: ");
                    String numero = scanner.nextLine().trim();

                    System.out.print("CEP: ");
                    String cep = scanner.nextLine().trim();

                    Endereco endereco = new Endereco(bairro, rua, numero, cep);
                    Cliente cliente = new Cliente(nome, endereco, cpf, telefone, tipo, dataCadastro);
                    sistema.cadastrarCliente(cliente);

                    break;

                case 2:
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfClienteAlteracao = scanner.next();
                    sistema.alterarDadosCliente(cpfClienteAlteracao);
                    break;

                case 3:
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfClienteConsulta = scanner.next();
                    sistema.excluirCliente(cpfClienteConsulta);
                    break;

                case 4:
                    System.out.print("Digite o nome ou CPF do cliente: ");
                    String dadoCliente = scanner.next();
                    System.out.println(sistema.consultarCliente(dadoCliente));
                    break;

                case 5:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}