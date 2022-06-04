package src;

import java.util.ArrayList;
import java.util.List;

public class ContaSalario extends Conta {

    private String empresa;
    private int salario;


    public ContaSalario(double sacar,double depositar,String nome, int numero, int agencia, String banco, double saldo, int empresa, int salario) {
        super(nome,numero, agencia, banco, saldo,sacar,depositar);
        this.salario = salario;
    }



    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double quantia) {
        this.saldo -= quantia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
