import java.util.Scanner;

public class suman {

    public static int suma(int n) {
        if (n <= 1)
            return n;
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = sc.nextInt();

        System.out.println("La suma es: " + suma(n));

        sc.close();
    }
}