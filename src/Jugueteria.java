import java.util.Scanner;

public class Jugueteria {

    /*
     * Una juguetería tiene mucho éxito en dos de sus productos: payasos y muñecas.
     * Suele hacer venta por correo y la empresa de logística les cobra por peso de
     * cada paquete así que deben calcular el peso de los payasos y muñecas que
     * saldrán en cada paquete a demanda. Cada payaso pesa 112 gy cada muñeca 75 g.
     * Escribir un programa que lea el número de payasos y muñecas vendidos en el
     * último pedido y calcule el peso total del paquete que será enviado.
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        final int pesoPayasos = 112;
        final int pesoMunecas = 75;
        int numeroPayasos, numeroMuñecas, pesoTotal;
        System.out.print("Por favor ingresa el numero de payasos vendidos: ");
        numeroPayasos = leer.nextInt();

        System.out.print("Por favor ingresa el numero de Muñecas vendidos: ");
        numeroMuñecas = leer.nextInt();

        pesoTotal = numeroMuñecas * pesoMunecas + numeroPayasos * pesoPayasos;

        System.out.println("Peso total del envio es: " + pesoTotal + " KG.");
        leer.close();

    }

}