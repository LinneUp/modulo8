package src;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private static int contadorDeContas = 1;
    private int numeroConta;
    private Pessoa pessoa;
    private double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.numeroConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nNumero da Conta: " + this.getNumeroConta() +
                "\nCliente: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCpf() +
                "\nEmail: " + this.pessoa.getEmail() +
                ",\nSaldo=" + this.getSaldo() +
                "\n" ;
    }
    public void depositar (double valor){
        if (valor >0){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu Deposito foi Concluido com Sucesso");
        }else{
            System.out.println("Nao foi possivel realizar o deposito" );
        }
    }
    public void  sacar (double valor){
        if (valor >0 && this.getSaldo()>= valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque realizado com sucesso");
        }else {
            System.out.println("Não foi possivel realizar o saque ");
        }
    }

    public void transferir(Conta contaParaDeposito, double valor){
        if (valor>0 && this.getSaldo() >= valor){
            setSaldo(getSaldo()- valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferencia realizada com sucesso");
        }else{
            System.out.println("Não foi possivel realizar a transferencia!");
        }
    }
    public  void  valoresTotal(){
        this.saldo = saldo;
    }

}
