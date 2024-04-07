import java.util.Scanner;

// Un constructor sabe que necesita 0.5 metros cúbicos de arena por metro 
// cuadrado de revoque a realizar. Escriba un algoritmo que le permita obtener
// la cantidad de arena necesaria para revocar una pared cualquiera, según 
// sus medidas (largo y alto) expresadas en metros. 

public class Construcion {

    public static void calculos(double largo, double ancho) {
        double arena = largo * ancho * 0.5;
        System.out.println("Seran necesarios: " + arena + " metros cubicos de arena");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el largo de la pared en metros");
        double largo = scan.nextDouble();

        System.out.println("ingrese el ancho de la pared");
        double ancho = scan.nextDouble();

        Construcion.calculos(largo, ancho);
        scan.close();
    }
}
