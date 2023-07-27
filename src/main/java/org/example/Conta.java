package org.example;

public class Conta {

    private Pessoa pessoa;

    private String agencia;

    private String numeroConta;

    private String DataAbertura;

    private int saldo;

    public Conta(Pessoa pessoa, String agencia, String numeroConta, String dataAbertura) {
        this.pessoa = pessoa;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.DataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getDataAbertura() {
        return DataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        DataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(double quantidade){

        saldo += quantidade;
    }

    public double sacar(double quantidade){
        if(quantidade<=saldo){
            saldo -= quantidade;
            return saldo;
        }
        else{
            return -1;
        }
    }

}
