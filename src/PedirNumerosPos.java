import java.util.Scanner;

public class PedirNumerosPos {
    /*
     * Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
     * números a introducir). El programa debe informar de cuantos números
     * introducidos son mayores que 0, menores que 0 e iguales a 0
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int cantidadNumeros, numerosPositivos = 0, numerosNegativos = 0, numeroIguales0 = 0, numero;
        System.out.print("Ingrese la cantidad de numeros: ");
        cantidadNumeros = leer.nextInt();
        while (cantidadNumeros > 0) {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            if (numero > 0) {
                numerosPositivos++;
            } else if (numero < 0) {
                numerosNegativos++;
            } else {
                numeroIguales0++;
            }
            cantidadNumeros--;
        }
        System.out.println("N° de numeros mayores a 0: " + numerosPositivos);
        System.out.println("N° de numeros menores a 0: " + numerosNegativos);
        System.out.println("N° de numeros iguales a 0: " + numeroIguales0);
        leer.close();
    }
}
