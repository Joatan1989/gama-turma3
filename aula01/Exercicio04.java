import java.util.Scanner;
public class Exercicio04 {
        public static void main(String[]args) {
         Scanner entrada = new Scanner(System.in);
         System.out.print("Infome um valor entre 0 a 50");
         int numero= Integer.parselnt(entrada.nextLine());
         if((numero<0)||(numero>50)){
             System.out.println("númerio deve ser entre 0 a 50");
         }
         else{

        
             for(int i=1;i<=10;i++){
                 System.out.println(numero+"X"+i+"="+(numero*i));
             }
             }
             System.out.println("\n");
                 }
    
}
