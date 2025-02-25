import java.util.Scanner;

public class Edad {
    /*
     * Algoritmo que pregunte al usuario su edad y muestre por pantalla todos los
     * años que ha cumplido (desde 1 hasta su edad). proyecto: edad
     */

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int edad;

        System.out.print("Ingresa su edad por favor: ");
        edad = leer.nextInt();
        int anioActual = 2025;
        int anioNacimiento = anioActual - edad;
        System.out.println(anioNacimiento);
        for (int i = 1; i <= edad; i++) {
            while (anioNacimiento < anioActual) {
                anioNacimiento++;
                System.out.println("Año " + anioNacimiento + " Cumple " + i++);
            }
        }
        leer.close();
    }
}
