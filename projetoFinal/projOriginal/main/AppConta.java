package projOriginal;

import java.util.Scanner;

import projOriginal.util.GerenciarConta;

public class AppConta {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    GerenciarConta contas = new GerenciarConta();
    int opcao = 0;
    int numeroConta;
    double saldoConta, valor, limite;
    
    
    

    while (opcao != 6){
   System.out.println("1-Abrir conta corrente");
   System.out.println("2-Abrir conta Especial");
   System.out.println("3-Consutar saldo");
   System.out.println("4-Depositar");
   System.out.println("5- Sacar");
   System.out.println("6-Sair");
   System.out.print("Sua Opção: ");
   entradaDigitada= teclado.nextLine();
   opcao = teclado.nextInt();

    switch (opcao) {

        case 1: // Abrir conta corrente.
        System.out.println("Informe número da conta: ");
                   numeroConta = teclado.nextLine();
                    contas.novaContaCorrente(numeroConta);
            break;

        case 2://Abrir conta especial.
          System.out.println("Informe número da conta: ");
          numeroConta = teclado.nextInt();
          Systemm.out.println("Digite o valor do limite: ");
         limite = teclado.nextDouble();
         contas.novaContaEspecial(numeroConta);
         break;


        case 3: // Consultar saldo.
        System.out.println("Informe o número da conta: ");
        numeroConta = teclado.nextInt();
        System.out.println(contas.getsaldoConta(numeroConta));
        break;

        case 4: // Fazer depósito.
        System.out.println("Informe o número da conta: ");
        numeroConta = teclado.nextInt();
        System.out.printeln("Digite o valor: ");
        valor = teclado.nextDouble();
        if (Contas.deposito(numeroConta, valor)) { 
            System.out.println("Deposito realizado com sucesso! ");
        } 
        else {
            System.out.println("Erro de operação!");
        }
        break;

        case 5: // Sacar.
        System.out.println("Informe o número da conta: ");
        numeroConta = teclado.nextInt();
        System.out.println("Digite o valor: ");
        valor = teclado.nextDouble();

        if (contas.saque(numeroConta, valo)) {
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Erro de operação.");
        }
        break;

        case 6:
        break;

        default:// Caso não seja nenhuma das opções.
        System.out.println("Opção invalida!");
         break;
    }

    }
      teclado.close();

    }
}