import java.util.Scanner;

public class Descuento {
    /*
     * Una tienda ofrece un descuento del 15% sobre el total de la compra y un
     * cliente desea saber cuanto deberá pagar finalmente por su compra. proyecto:
     * descuento
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        final double descuento15 = 0.15;
        double totalCompra, pagoFinal;
        System.out.print("Ingresa el total de su compra: ");
        totalCompra = leer.nextDouble();
        pagoFinal = totalCompra - (totalCompra * descuento15);
        System.out.println("Paga final " + pagoFinal + " $.");
        leer.close();
    }
}
