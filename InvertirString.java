import java.util.Scanner;

// Esta clase invierte cualquier Styring que le pases

public class InvertirString {

    public static void invertir(String texto){

        // Inserta los caracteres del texto en un nuevo array
        String[] array = texto.split("");
        StringBuilder newtexto = new StringBuilder();

        //Recorre y modifica la posicion de cara caracter en el array
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