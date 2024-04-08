import java.util.Scanner;

public class Calculadora {

    public static double potencia(double base, int potencia){
        double resultado = 1;
        for (int i = 0; i < potencia; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero del que desea obtener su potencia");
        double base = scan.nextDouble();

        System.out.println("Ingrese el valor de la potencia");
        int potencia = scan.nextInt();

        System.out.println("El resultado es " + Calculadora.potencia(base, potencia));
        scan.close();
    }
}