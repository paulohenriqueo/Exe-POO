import java.util.Scanner;

public class Menu {
        public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);

        Circulo circulo = new Circulo();

        System.out.println("\nBem vindo ao meu primeiro programa Java :)");

        int option2;

        do {
            System.out.println("\nDigite o valor do raio: ");
            circulo.setRaio(scanner.nextDouble());

            int option1;

            do {

                System.out.println("\nEscolha qual opção desaja vizualizar");
                System.out.println("1 Para Visualizar Area do Circulo: ");
                System.out.println("2 Para Visualizar Perimetro do Circulo: ");
                System.out.println("3 Para Visualizar Diametro do Circulo: ");
                System.out.println("0 PARA SAIR: ");
                option1 = scanner.nextInt();

                switch (option1) {
                    case 1:
                        System.out.println("\nArea do Circulo: \n" + circulo.calcArea());
                        break;
                    case 2:
                        System.out.println("\nPerimetro do Circulo: \n" + circulo.calcPerimetro());
                        break;
                    case 3:
                        System.out.println("\nDiametro do Circulo: \n" + circulo.calcDiametro());
                        break;
                    case 0:
                        System.out.println("\nSaindo...\n");
                        break;
                    default:
                        System.out.println("\nValor não correnpondido, por favor tente novamente.\n");
                        break;
                }

            } while (option1 != 0);

            System.out.println("\nDeseja fazer mais calculos?");
            System.out.println("\n1 Calcular novamente novamente: ");
            System.out.println("\n0 PARA SAIR");
            option2 = scanner.nextInt();

            if (option2 == 0) {
                System.out.println("Saindo...");
            }

        } while (option2 != 0);

        scanner.close();

    }
}
