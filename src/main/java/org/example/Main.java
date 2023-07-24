package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int opcao;

        do{

            System.out.println("Digite qual opcao deseja:");
            System.out.println("1- cadastrar / 2 Cadastrado");
            opcao = digitar.nextInt();

            switch (opcao){
                case 1:
                    cadastrarUsuario();
                    break;

                case 2:
                    menuUsuarioCadastrado();
                    break;
            }

        }while (opcao != -1);
        digitar.close();
    }

    public static void cadastrarUsuario(){

        Scanner digitar = new Scanner(System.in);

        System.out.println("Digite as informações");
        System.out.println("Digite seu nome");
        String nome = digitar.nextLine();
        System.out.println("Digite seu CPF");
        String cpf = digitar.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dataNascimento = digitar.nextLine();
        System.out.println("Digite o endereco:");
        String endereco = digitar.nextLine();

        Pessoa cadastroPessoa = new Pessoa(nome,cpf,dataNascimento,endereco);
        Conta conta = new Conta(cadastroPessoa,"05221-050","58","28/07/2020");

        digitar.close();

    }

    public static void menuUsuarioCadastrado(){

        Scanner digitar = new Scanner(System.in);
        int opcao;


        do{

            System.out.println("Digite a o que deseja fazer:");
            System.out.println("1 - verificar cadastro / 2 - saldo / 3 - depositar / 4 - sacar");
            opcao = digitar.nextInt();

            switch(opcao){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
            }

        }while(opcao != -1);

        digitar.close();

    }

}




