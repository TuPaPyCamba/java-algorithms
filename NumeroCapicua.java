import java.util.Scanner;

public class NumeroCapicua {

    public static void validar(int numero){
        String numerotexto = String.valueOf(numero);
        String numeroReverso = new StringBuilder(numerotexto).reverse().toString();

        if (numerotexto.equals(numeroReverso)) {
            System.out.println("El numero " + numero + " es capicua");
        }else{
            System.out.println("El numero " + numero + " no es capicua");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero del que desea saber si es capicua");
        int numero = scan.nextInt();

        NumeroCapicua.validar(numero);
    }
}
