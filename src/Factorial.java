import java.util.Scanner;

public class Factorial {
    /*
     * Algoritmo para calcular el factorial de un número que deberá solicitarse por
     * el teclado. proyecto: factorial
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        System.out.print("Ingrese un numero y le mostrare su factorial: ");
        numero = leer.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        leer.close();
    }
}
