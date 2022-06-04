package src;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta{
    private double chequeEspecial;


    public ContaCorrente(double sacar, double depositar,String nome, int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(nome,numero, agencia, banco, saldo,sacar,depositar);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }


    @Override
    public double getSaldo() {
        return this.chequeEspecial + this.saldo ;
    }

}


