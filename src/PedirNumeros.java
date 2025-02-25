import java.util.Scanner;

public class PedirNumeros {
    /*
     * Algoritmo que pida números hasta que se introduzca un cero. Debe mostrar la
     * lista ingresada, imprimir la suma y la media de todos los números
     * introducidos.
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        double media;
        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            suma += numero;
            contador++;
        } while (numero != 0);

        media = suma / contador;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        leer.close();
    }
}
