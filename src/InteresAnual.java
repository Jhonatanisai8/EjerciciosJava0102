import java.util.Scanner;

public class InteresAnual {
    /*
     * Algoritmo que pregunte al usuario una cantidad a invertir, el interés anual y
     * el número de años, y muestre por pantalla el capital obtenido en la inversión
     * cada año que dura la inversión.
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        double cantidadInvertir, intereresAnual, capitalObtenida;
        int numeroAños;
        System.out.print("Cantidad a Invertir: ");
        cantidadInvertir = leer.nextDouble();
        System.out.print("Interes Anual: ");
        intereresAnual = leer.nextDouble();
        System.out.print("Numero de años: ");
        numeroAños = leer.nextInt();
        int contadorAux = 0;
        while (numeroAños > 0) {
            contadorAux++;
            capitalObtenida = cantidadInvertir * (Math.pow(1 + (intereresAnual / 100), contadorAux));
            System.out.println("Año " + contadorAux + ": Capital = " + capitalObtenida);
            numeroAños--;
        }
        leer.close();
    }
}
