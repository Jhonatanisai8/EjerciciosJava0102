import java.util.Scanner;

public class TipoTriangulo {
    /*
     * Algoritmo que lea 3 datos de entrada A, By C. Estos corresponden ladoA las
     * dimensiones de los lados de un triángulo. El programa debe determinar que
     * tipo de triangulo es, teniendo en cuenta los siguiente:
     * 
     * Si se cumple Pitágoras entonces es triángulo rectángulo
     * 
     * Si sólo dos lados del triángulo son iguales entonces es isósceles.
     * 
     * Si los 3 lados son iguales entonces es equilátero.
     * 
     * Si no se cumple ninguna de las condiciones anteriores, es escaleno.
     * 
     * proyecto: Tipo Triangulo
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int ladoA, ladoB, ladoC;
        System.out.print("Ingrese la dimensión del lado A: ");
        ladoA = leer.nextInt();
        System.out.print("Ingrese la dimensión del lado B: ");
        ladoB = leer.nextInt();
        System.out.print("Ingrese la dimensión del lado C: ");
        ladoC = leer.nextInt();

        if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) {
            // comprabamos
            if (Math.pow(ladoA, 2) + Math.pow(ladoB, 2) == Math.pow(ladoC, 2) ||
                    Math.pow(ladoA, 2) + Math.pow(ladoC, 2) == Math.pow(ladoB, 2) ||
                    Math.pow(ladoB, 2) + Math.pow(ladoC, 2) == Math.pow(ladoA, 2)) {
                System.out.println("El triángulo es RECTÁNGULO.");
            } else if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("El triángulo es EQUILÁTERO.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("El triángulo es ISÓSCELES.");
            } else {
                System.out.println("El triángulo es ESCALENO.");
            }
        } else {
            System.out.println("No es triangulo");
        }

        leer.close();
    }
}
