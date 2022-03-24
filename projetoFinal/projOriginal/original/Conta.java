package projOriginal.original;

 public class Conta {
    private int numeroConta;
    private double saldoConta;


    public Conta (int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

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


    public double getSaldoConta() {
        return saldoConta;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
        @Override
    public String  toString() {
        return numeroConta + " - " + saldoConta + "-";
    }

}
    
 
