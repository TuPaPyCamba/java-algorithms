import java.util.Scanner;

public class InvertirString {

    public static void invertir(String texto){
        String[] array = texto.split("");
        StringBuilder newtexto = new StringBuilder();

        for (int i = array.length; i > 0; i--){
            newtexto.append(array[i - 1]);
        }
        System.out.println(newtexto);
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Ingrese el texto que desea invertir");
        String texto = scan.nextLine();

        InvertirString.invertir(texto);

        scan.close();
    }
}