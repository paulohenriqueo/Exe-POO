package Conta;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao, saida;
        int num;
        double sal, valor;
         
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o Numero da conta: ");
        num = entrada.nextInt();
        
        System.out.println("Digite o saldo da conta: ");
        sal = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente(num, sal);
        
        System.out.println("Ola conta de numero: " + objConta.numero);
        
        System.out.println("Seu saldo é: " + objConta.saldo);
           
        do{
            System.out.println("\nQual operação você deseja realizar:");

            System.out.println("1 - Depositar.");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consulta o saldo");
            System.out.println("4 - Sair.\n");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1 :
                    System.out.println("Digite o valor que deseja depositar na conta" + objConta.getNumero() + ":");
                    valor = entrada.nextDouble();
                    objConta.depositar(valor);
                break;
                
                case 2 :
                    do{
                        System.out.println("Digite o valor que deseja sacar na conta" + objConta.getNumero() + ":");
                        valor = entrada.nextDouble();
                        
                        if(valor > 0 && valor <= objConta.getSaldo()){
                            objConta.sacar(valor);
                            System.out.println("Saque realizado com sucesso");
                            saida = 1;
                        }
                        else{
                            System.out.println("Valor insuficiente. Tente novamente");
                            saida = 2;
                        }
                    
                    }while(saida == 2);
                break;
                
                case 3 :
                    System.out.println("O saldo atual da conta" + objConta.getNumero() + "\nR$: " + objConta.getSaldo());
                break;
                
                case 4 :
                    System.out.println("Saindo...");
                break;
                
                default:
                        System.out.println("Operação invalida. Tente novamente");
            }
            
        }while(opcao != 4);

        entrada.close();
    }
    
}
