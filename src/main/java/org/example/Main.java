package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);

        System.out.println("Digite as informações");
        System.out.println("Digite seu nome");
        String nome = digitar.nextLine();
        System.out.println("Digite seu CPF");
        String cpf = digitar.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dataNascimento = digitar.nextLine();

        Conta conta = new Conta(nome, cpf,dataNascimento); //Criando o Objeto Conta

        System.out.println("Digite qual opcao deseja:");
        System.out.println("1- Verificar cadastro / 2 - saldo / 3 - deposito / 4 - saque");
        int opcao = digitar.nextInt();

        switch (opcao){
            case 1:

                System.out.println(conta.getNome());
                System.out.println(conta.getCpf());
                System.out.println(conta.getDataNascimento());

                break;

            case 2:
                System.out.println("O seu saldo = " + conta.getSaldo());
                break;

            case 3:
                System.out.println("Digite a quantidade que deseja depositar");
                int quantidadeDepositar = digitar.nextInt();
                conta.depositar(quantidadeDepositar);
                System.out.println("Quantidade do saldo = " + conta.getSaldo());
                break;

            case 4:
                System.out.println("Digite a quantidade para fazer o saque:");
                int quantidadeSaque = digitar.nextInt();
                conta.sacar(quantidadeSaque);
                System.out.println("Quantidade restante do saldo = " + conta.getSaldo());
        }

        digitar.close();

    }

}