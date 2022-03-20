package etapa01;

abstract class Conta {
    private int numeroConta;
    private double saldoConta;


    public void mostrarDados(){ 
        System.out.println(numeroConta + " " + saldoConta);

    }

    public double deposita(double valorDoDeposito){
        this.saldoConta+=valorDoDeposito;
        return saldoConta;

    }

    public double saque(double valorDoSaque){
        return this.saldoConta-=valorDoSaque;
    }


    public double getSaldo() {
        return saldoConta;
    }
    
    public int getNumero() {
        return numeroConta;
    }

}
    
}
