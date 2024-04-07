

// construya el algoritmo tal que, dado el radio de una esfera, calcule e imprima el área y su volumen.

import java.util.Scanner;

public class Esfera {
    
    public static void calculadora(double radio){

        double area = 4*Math.PI*Math.pow(radio, 2);
        System.out.println("El area de la esfera es de: " + area);

        double volumen = 1.3333*Math.PI*Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es de: " + volumen);

    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el radio de la esfera");
        double radio = scan.nextDouble();

        Esfera.calculadora(radio);
        scan.close();
    }
}
