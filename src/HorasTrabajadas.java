import java.util.Scanner;

public class HorasTrabajadas {
    /*
     * Algoritmo que pregunte al usuario por el número de horas trabajadas y el
     * coste por hora. Después debe mostrar por pantalla la paga que le corresponde.
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int horas, costoHora;
        int pagaTotal;
        System.out.print("Ingresa las horas trabajadas: ");
        horas = leer.nextInt();
        System.out.print("Ingresa el costo por hora: ");
        costoHora = leer.nextInt();

        pagaTotal = costoHora * horas;
        System.out.println("Paga Total: " + pagaTotal);
        leer.close();
    }
}
