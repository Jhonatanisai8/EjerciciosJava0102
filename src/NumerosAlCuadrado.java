import java.util.Scanner;

public class NumerosAlCuadrado {
    /*
     * Algoritmo donde se cree un arreglo con n números, ingresados por teclado y
     * mostrar sus valores elevados al cuadrado.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingresa la cantidad de numeros: ");
        cantidad = leer.nextInt();
        int arreglo[] = new int[cantidad];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa un numero: ");
            arreglo[i] = leer.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(Math.pow(arreglo[i], 2));
        }

        leer.close();       ;
    }
}
