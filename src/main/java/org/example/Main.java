package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Banco");

        Conta conta = new Conta("Wesley", "457.545.849-54","28/07/1999");

        System.out.println(conta.getNome());
        System.out.println(conta.getCpf());
        System.out.println(conta.getDataNascimento());

        conta.depositar(1000);

        System.out.println(conta.getSaldo());

        conta.sacar(50);
        System.out.println(conta.getSaldo());

    }

}