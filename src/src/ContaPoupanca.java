package src;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;
    List<Conta> cPoupanca = new ArrayList<>();

    public List<Conta> getcPoupanca() {
        return cPoupanca;
    }

    public void addNovaConta(Conta novaConta){
        cPoupanca.add(novaConta);

    }

    public ContaPoupanca(double sacar,double depositar,String nome, int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(nome,numero, agencia, banco, saldo,sacar,depositar);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }


    public double getSaldo(int dia) {
        if (dia >= this.diaAniversario) {

            this.saldo = this.saldo + this.taxaDeJuros * this.saldo;
            return this.saldo;
        }
        else
            return this.saldo;
    }

    @Override
    public void sacar(double quantia) {
        this.saldo -= quantia;
    }


    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }

}
