package src;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente( Pessoa pessoa) {
        super( pessoa);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }
}



