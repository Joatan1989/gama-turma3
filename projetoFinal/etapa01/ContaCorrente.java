package etapa01;

public class ContaCorrente extends Conta {

    @Override
    public double saque(double valorDoSaque) {
        if(getSaldo()>valorDoSaque){
            saque(valorDoSaque);

        }
        return getSaldo();
    }
    
}

    

