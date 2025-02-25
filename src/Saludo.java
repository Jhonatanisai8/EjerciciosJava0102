import java.util.Scanner;

public class Saludo {

    static Scanner leer = new Scanner(System.in);

    /*
     * Escribir un Algoritmo que pregunte al usuario su nombre completo, y luego lo
     * salude. (usar una variable cadena [String]) proyecto: salud
     */
    public static void main(String[] args) {
        String nombreCompleto;
        System.out.print("Por favor ingrese su nombre completo: ");
        nombreCompleto = leer.nextLine();
        System.out.println("Hola! " + nombreCompleto);
        leer.close();
    }
}