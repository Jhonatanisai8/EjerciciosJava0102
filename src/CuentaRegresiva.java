import java.util.Scanner;

public class CuentaRegresiva {
    /*
     * Algoritmo que pida al usuario un número entero positivo y muestre por
     * pantalla la cuenta atrás desde ese número hasta cero. proyecto
     * cuenta regresiva
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        System.out.print("Ingrese un numero por favor: ");
        numero = leer.nextInt();
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        leer.close();
    }
}
