package projOriginal.original;

import javax.naming.LimitExceededException;

import projOriginal.original.Conta;

public class ContaEspecial extends Conta {
 private double chequeEspecial;
    public ContaEspecial(int numeroConta, double saldoConta){
        super(numeroConta, saldoConta);
        this.chequeEspecial = chequeEspecial;
    } 

 
    @Override
    public double saque(double valorDoSaque) {
        double limiteDeTransação=getSaldoConta()+chequeEspecial;
        if(limiteDeTransação>valorDoSaque){
           super.saque(valorDoSaque);
           return getSaldoConta();
        }
       ;
       return getSaldoConta();
    }
}


