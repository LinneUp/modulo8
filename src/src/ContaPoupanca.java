package src;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta {


    private int diaAniversario;
    private double taxaDeJuros;
    private double saldoP;

    public ContaPoupanca( String pessoa) {
        super(pessoa);
    }

    public double getSaldoP(int dia) {
        if (dia >= this.diaAniversario) {

            this.saldoP =  this.saldoP + this.taxaDeJuros * this.saldoP;
            return this.saldoP;
        } else
            return this.saldoP;
    }


    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }


}
