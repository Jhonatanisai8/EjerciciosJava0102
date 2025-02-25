import java.util.Scanner;

public class PromedioCalificaciones {
    /*
     * Realizar un algoritmo que permita encontrar el promedio de n calificaciones
     * de un estudiante.
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroCalificaciones;
        System.out.print("Ingrese el numero de calificaciones: ");
        numeroCalificaciones = leer.nextInt();
        double nota, promedio, suma = 0;
        int aux = numeroCalificaciones;
        int contador = 0;
        while (numeroCalificaciones > 0) {
            contador++;
            System.out.print("Ingrese la nota N° " + contador + ": ");
            numeroCalificaciones--;
            nota = leer.nextDouble();
            suma += nota;
        }
        promedio = suma / aux;
        System.out.println("Promedio: " + promedio);
        leer.close();
    }
}
