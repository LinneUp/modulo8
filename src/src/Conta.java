package src;

import java.util.ArrayList;

public class Conta {

    private String nome;
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    private double sacar;
    private double depositar;

    public Conta() {
        String nome;
         int numero;
         int numero2;
         int agencia;
         String banco;
         double saldo;
         double sacar;
         double depositar;

    }


    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo(){
        return saldo+ getDepositar()+depositar;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public Conta(String nome, int numero, int agencia, String banco, double saldo, double sacar, double depositar) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
        this.sacar = sacar;
        this.depositar = depositar;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar (double quantia){
        this.saldo -= quantia;
    }
    public void depositar (double quantia) {this.saldo += quantia;}

}
