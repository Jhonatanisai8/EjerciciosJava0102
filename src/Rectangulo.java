import java.util.Scanner;

public class Rectangulo {
    /*
     * Calcular el perímetro y área de un rectángulo dada su base y su altura. (usar
     * enteros [int]) proyecto: rectangulo
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int base, altura;
        double area, perimetro;
        System.out.println("Ingrese la base del rectángulo: ");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        altura = leer.nextInt();

        area = base * altura;
        perimetro = 2 * (base + altura);
        System.out.println("Area del rectángulo es: " + area + " cm2");
        System.out.println("Perímetro del rectángulo es: " + perimetro + " cm2");
        leer.close();
    }
}
