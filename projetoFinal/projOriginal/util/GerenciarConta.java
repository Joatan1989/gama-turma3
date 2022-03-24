package projOriginal.util;

import java.util.ArrayList;

import projOriginal.original.Conta;

public class GerenciarConta {
    private ArrayList<Conta> contas;

    public GerenciarConta() {
        contas = new ArrayList<>();
    }
   public void adicionar(Conta c){
       contas.add(c);
   }

   public String exibir(int numeroConta) {
       for (int i = 0;i < contas.size();i++){
           if (contas.get(i).getnumeroConta() == numeroConta){
            return contas.get(i).toString ();

           }

       }
       return "Não encontrado";

   }

   // Este método procura a posição da pessoa no Array, a partir do código fornecido
    // É privado pois só é usado no método remover
   private int posicao(int numeroConta){
       for (int i = 0; i < contas.size(); i++ ) {
           if (contas.get(i).get.numeroConta() == numeroConta) {
               return i;
           }
       }
       return -1; // retorna -1 se não achou
   }
   public boolean remover(int numeroConta) {
     int posicao = posicao(numeroConta);
     if (contas.remove(posicao) != null) {
         return true;
     }

     return false;
   }
    
}
