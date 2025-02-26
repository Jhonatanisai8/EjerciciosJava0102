import java.util.Scanner;

public class PedirNombre {
    /*
     * Algoritmo que pregunte el nombre completo del usuario y después muestre por
     * pantalla el nombre completo del usuario tres veces, una con todas las letras
     * minúsculas, otra con todas las letras mayúsculas y otra solo con la primera
     * letra del nombre y de los apellidos en mayúscula. El usuario puede introducir
     * su nombre combinando mayúsculas y minúsculas como quiera.
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String nombres, apellidos;

        System.out.print("Ingrese sus nombres: ");
        nombres = leer.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        apellidos = leer.nextLine();

        System.out.println(nombres.toLowerCase() + " " + apellidos.toLowerCase());
        System.out.println(nombres.toUpperCase() + " " + apellidos.toUpperCase());

        String nombreCompleto = nombres +" "+ apellidos;
        String[] nom = nombreCompleto.split(" ");
        String texto = "";
        for (int i = 0; i < nom.length; i++) {
            texto += String.valueOf(nom[i].charAt(0)).toUpperCase()
                    .concat(String.valueOf(nom[i].substring(1, nom[i].length())))+"  ";
        }
        System.out.println(texto);
        leer.close();
    }
}
