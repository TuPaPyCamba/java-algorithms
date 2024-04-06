import java.util.Scanner;

public class InvertirStringSecondWay {
    
    public static void invertir(String texto){

        String newtexto = new StringBuilder(texto).reverse().toString();
        System.out.println(newtexto);

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el testo que desea modificar");
        String texto = scan.nextLine();

        InvertirStringSecondWay.invertir(texto);

        scan.close();
    }
}
