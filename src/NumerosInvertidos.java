import java.util.Scanner;

public class NumerosInvertidos {
    /*
     * Algoritmo donde se ingresen 5 números, almacenarios en un arreglo y
     * mostrarlos en el orden que fueron ingresados y en forma invertida
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo[] = new int[5];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa un numero: ");
            arreglo[i] = leer.nextInt();
        }

        System.out.println("Orden inverso");
        for (int i = arreglo.length; i > 0; i--) {
            System.out.println(arreglo[i-1]);
        }
        leer.close();
    }
}
