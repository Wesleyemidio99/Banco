package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);

        System.out.println("Banco");
        System.out.println("Digite as informações");
        System.out.println("Digite seu nome");
        String nome = digitar.nextLine();
        System.out.println("Digite seu CPF");
        String cpf = digitar.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dataNascimento = digitar.nextLine();

        Conta conta = new Conta(nome, cpf,dataNascimento); //Criando o Objeto Conta

        System.out.println(conta.getNome());
        System.out.println(conta.getCpf());
        System.out.println(conta.getDataNascimento());

        System.out.println("Ditie a quantidade que deseja depositar");
        int quantidadeDepositar = digitar.nextInt();
        conta.depositar(quantidadeDepositar);

        System.out.println("Seu saldo = "+ conta.getSaldo());

        System.out.println("Digite a quantidade para fazer o saque:");
        int quantidadeSaque = digitar.nextInt();

        conta.sacar(quantidadeSaque);
        System.out.println("Quantidade restante do saldo = " + conta.getSaldo());

        digitar.close();

    }

}