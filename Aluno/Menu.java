package Aluno;

import java.util.Scanner;

public class Menu {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Bem Vindo. Este sistema calcula média de alunos:");

        int opcao2;

        do {
            System.out.println("\nDigite o RA do Aluno: ");
            aluno.setRA(scanner.nextInt());

            System.out.println("Digite a nota da prova 1: ");
            aluno.setNtPrv1(scanner.nextDouble());

            System.out.println("Digite a nota da prova 2: ");
            aluno.setNtPrv2(scanner.nextDouble());

            System.out.println("Digite a nota do trabalho 1: ");
            aluno.setNtTrab1(scanner.nextDouble());

            System.out.println("Digite a nota da trabalho 2: ");
            aluno.setNtTrab2(scanner.nextDouble());

            int opcao1;

            do {
                System.out.println("\n1 - Exibir nota das Provas/Trabalhos");
                System.out.println("2 - Exibir media dos trabalhos/Provas");
                System.out.println("3 - Exibir media final");
                System.out.println("4 - Sair\n");
                System.out.println("Digite a opção: ");
                opcao1 = scanner.nextInt();

                switch (opcao1) {
                    case 1:
                        System.out.println("\nNota Prova1: " + aluno.getNtPrv1());
                        System.out.println("Nota Prova2: " + aluno.getNtPrv2());
                        System.out.println("\nNota Trabalho1: " + aluno.getTrab1());
                        System.out.println("Nota Trabalho2: " + aluno.getTrab2());
                        break;
                    case 2:
                        System.out.println("Media das Provas: " + aluno.calcMediaProva());
                        System.out.println("\nMedia dos Trabalhos: " + aluno.calcMediaTrab());
                        break;
                    case 3:
                        System.out.println("Media Final do Aluno: " + aluno.calcMediaFinal());
                        break;
                    default:
                        System.out.println("Valor não correnpondido, por favor tente novamente.\n");
                        break;
                }

            } while (opcao1 != 4);

            System.out.println("\nDeseja fazer mais consultas?");
                System.out.println("\n1 - Consultar Aluno");
                System.out.println("\n2 - SAIR");
                opcao2 = scanner.nextInt();

                if (opcao2 == 2) {
                    System.out.println("Saindo...");
                }

        } while (opcao2 != 2);

        scanner.close();

    }
    
}
