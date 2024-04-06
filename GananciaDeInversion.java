import java.util.Scanner;

// Una persona desea invertir su capital en un banco y desea saber cuánto 
// dinero ganará después de ciertos dias si el banco le pagará intereses del 15% 
// anual, cree un algoritmo para solucionarlo.

public class GananciaDeInversion {

    public static void earned(int dias, double capital) {

        double interesDiario = 0.041095/100, ganancia;

        for (int i = 0; i < dias; i++) {
            ganancia = capital*interesDiario;
            capital = capital + ganancia;
            System.out.println("Capital actual: " + capital + " ganancia diaria: " + ganancia );
        }
        System.out.println("El capital Final tras " + dias + " es de: $" + capital);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dias;
        double capital;

        // Solicita el dinero invertido en el banco y el tiempo que ha estado a inversion dicho dinero
        System.out.println("Ingrese el capital inicial:");
        capital = scan.nextDouble();

        System.out.println("Ingrese el número de días que el dinero estuvo invertido:");
        dias = scan.nextInt();

        GananciaDeInversion.earned(dias, capital);

        scan.close();
    }
}