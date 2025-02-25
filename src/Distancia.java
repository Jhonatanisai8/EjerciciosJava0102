import java.util.Scanner;

public class Distancia {
    /*
     * Pide al usuario dos puntos A (x,y) y B(x,y) que representen dos puntos en el
     * plano. Calcula y muestra la distancia entre ellos. proyecto: distancia
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        double distancia;
        System.out.print("Coordenada X1 Punto 01: ");
        x1 = leer.nextInt();
        System.out.print("Coordenada Y1 Punto 01: ");
        y1 = leer.nextInt();

        System.out.print("Coordenada X2 Punto 02: ");
        x2 = leer.nextInt();
        System.out.print("Coordenada Y2 Punto 02: ");
        y2 = leer.nextInt();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Distancia: " + distancia);

        leer.close();
    }
}
