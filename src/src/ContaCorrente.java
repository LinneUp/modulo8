package src;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente( String pessoa) {
        super( pessoa);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }
}



