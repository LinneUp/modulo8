package src;

import java.util.ArrayList;
import java.util.List;

public class ContaSalario extends Conta {



    private String empresa;
    private int salario;

    public ContaSalario( Pessoa pessoa) {
        super( pessoa);
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
