package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        System.out.println("Digite suas informacoes pessoais:");
        System.out.println("Digite seu nome");
        String nome = digitar.nextLine();
        System.out.println("Digite seu CPF");
        String cpf = digitar.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dataNascimento = digitar.nextLine();
        System.out.println("informe seu endereco:");
        System.out.println("Digite o nome da rua:");
        String rua = digitar.nextLine();
        System.out.println("Digite o numero da sua casa:");
        int casa  = digitar.nextInt();
        digitar.nextLine();
        System.out.println("Digite o nome do bairro:");
        String bairro = digitar.nextLine();
        System.out.println("Digite o nome da cidade:");
        String cidade = digitar.nextLine();
        System.out.println("Digite o nome do estado:");
        String estado = digitar.nextLine();

        Endereco endereco = new Endereco(rua,casa,bairro,cidade,estado);

        Pessoa cadastroPessoa = new Pessoa(nome,cpf,dataNascimento,endereco);
        Conta conta = new Conta(cadastroPessoa,"05221-050","58","28/07/2020");

        menuUsuarioCadastrado(conta);

        digitar.close();
    }

    public static void menuUsuarioCadastrado(Conta conta){

        Scanner digitar = new Scanner(System.in);
        int opcao;



        do{

            System.out.println("Digite a o que deseja fazer:");
            System.out.println("1 - verificar cadastro / 2 - saldo / 3 - depositar / 4 - sacar");
            opcao = digitar.nextInt();

            switch(opcao){
                case 1:
                    System.out.println(conta.getPessoa().getNome());
                    System.out.println(conta.getPessoa().getEndereco());
                    System.out.println(conta.getPessoa().getCpf());
                    System.out.println(conta.getPessoa().getDataNascimento());
                    break;

                case 2:
                    System.out.println(conta.getSaldo());
                    break;

                case 3:
                    System.out.println("Digite a quantidade para depositar");
                    double quantidadeDeposito = digitar.nextInt();
                    conta.depositar(quantidadeDeposito);
                    System.out.println("Depositado");

                    break;

                case 4:
                    System.out.println("Digite a quantidade para sacar:");
                    double quantidadeSaque = digitar.nextInt();
                    double saque = conta.sacar(quantidadeSaque);
                    if(saque == -1){
                        System.out.println("Saldo insuficiente");
                    }
                    else{
                        System.out.println("Saque feito com sucesso");
                    }
                    break;
            }

        }while(opcao != -1);

        digitar.close();

    }

}




