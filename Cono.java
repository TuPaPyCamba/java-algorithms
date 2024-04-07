import java.util.Scanner;

// Construya el algoritmo tal que, dado el radio, la generatriz y la altura de un 
// cono, calcule e imprima el área de la base, el área lateral, el área total y su 
// volumen.

public class Cono {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Inggrese el valor del radio");
        double radio = scan.nextDouble();

        System.out.println("Ingrese el valor de la generatriz");
        double generatriz = scan.nextDouble();

        System.out.println("Ingrese el valor de la altura del cono");
        double altura = scan.nextDouble();

        double base = Math.PI*(radio*altura);
        double lado = Math.PI*radio*generatriz;
        double volumen = 0.33333*base*altura;
        double atotal = base + lado;

        System.out.println("El valode para la base del cono es: " + base);
        System.out.println("El valode para el lado del cono es: " + lado);
        System.out.println("El valode para el area del cono es: " + atotal);
        System.out.println("El valode para el volumen del cono es: " + volumen);

        scan.close();
    }
}