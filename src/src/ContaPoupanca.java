package src;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public double getSaldo(int dia) {
        if (dia >= this.diaAniversario) {

            this.saldo = this.saldo + this.taxaDeJuros * this.saldo;
            return this.saldo;
        } else
            return this.saldo;
    }


    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }

}
