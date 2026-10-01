import java.util.Scanner;

public class InvertirString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + invertida);
    }
}
