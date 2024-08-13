import java.util.Scanner;

public class Circulo{

    private double raio;
    private double area;

    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }

    public double calcArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    public double calcPerimetro(){
        return 2 * Math.PI * raio; 
    }
    public double calcDiametro(){
        return 2 * raio;
    }

    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();
        System.out.println("Digite o raio: ");

        circulo.setRaio(scanner.nextDouble());

    }
    
    

}