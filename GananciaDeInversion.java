import java.util.Scanner;

// Una persona desea invertir su capital en un banco y desea saber cuánto 
// dinero ganará después de un mes si el banco le pagará intereses del 2% 
// mensual, cree un algoritmo para solucionarlo.

public class GananciaDeInversion {

    public static void earned(int dias, double capital) {
        double ganancia;
        ganancia = dias * capital * 0.02;
        System.out.println("Su ganancia es: " + ganancia + " tras invertir: " + capital + " durante: " + dias + " días.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dias;
        double capital;

        System.out.println("Ingrese el capital inicial:");
        capital = scan.nextDouble();

        System.out.println("Ingrese el número de días que el dinero estuvo invertido:");
        dias = scan.nextInt();

        LinearStructure.earned(dias, capital);
    }
}