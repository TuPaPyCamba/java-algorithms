import java.util.Scanner;

public class Cubo {

    public static void calculos(double lado) {

        double areaBase = Math.pow(lado, 2);
        double areaLateral = 4*Math.pow(lado, 2);
        double areaTotal = 6 * Math.pow(lado, 2);
        double volumen = Math.pow(lado, 3);

        System.out.println("El area de la base del cubo corresponde a: " + areaBase);
        System.out.println("El area lateral del cubo corresponde a: " + areaLateral);
        System.out.println("El area total del cubo corresponde a: " + areaTotal);
        System.out.println("El volumen del cubo corresponde a: " + volumen);
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el largo de uno de los lados del cubo");
        double lado = scan.nextDouble();
        
        Cubo.calculos(lado);
        scan.close();
    }
}
