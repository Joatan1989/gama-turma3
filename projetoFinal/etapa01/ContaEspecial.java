package etapa01;

public class ContaEspecial extends Conta{
    double valorLimite;




    @Override
    public double saque(double valorDoSaque) {
        double limiteDeTransação=getSaldo()+valorLimite;
        if(limiteDeTransação>valorDoSaque){
            saque(valorDoSaque);

        };
        return getSaldo();
    }
}
    

