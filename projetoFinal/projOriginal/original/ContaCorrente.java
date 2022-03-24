package projOriginal.original;

import projOriginal.original.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, double saldoConta) {
        super(numeroConta, saldoConta);

    }

    @Override
    public double saque(double valorDoSaque) {
        if (getSaldoConta() >= valorDoSaque) {
            return super.saque(valorDoSaque);
        }
        return getSaldoConta();
    }

}
