package src;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void addNovaConta(Conta conta) {
        contas.add(conta);
    }

    public double getSaldoTotal() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }



}
