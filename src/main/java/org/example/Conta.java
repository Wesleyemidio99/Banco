package org.example;

public class Conta {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private int saldo;

    public Conta(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int quantidade){
        saldo += quantidade;
    }

    public int sacar(int quantidade){
        if(quantidade<=saldo){
            saldo -= quantidade;
            return saldo;
        }
        else{
            return 0;
        }
    }

}
