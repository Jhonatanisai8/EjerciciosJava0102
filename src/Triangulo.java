import java.util.Scanner;

public class Triangulo {
    /*
     * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa. (usar
     * decimales (double]) proyecto: triangulo
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        double cateto01, cateto02, hipotenusa;
        System.out.print("Ingresa el Cateto A: ");
        cateto01 = leer.nextDouble();
        System.out.print("Ingresa el Cateto B: ");
        cateto02 = leer.nextDouble();

        hipotenusa = Math.sqrt((cateto01 * cateto01) + (cateto02 * cateto02));
        System.out.println("La hipotenusa es: " + hipotenusa + " cm");
        leer.close();
    }

}
