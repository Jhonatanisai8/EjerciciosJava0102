import java.util.Scanner;

public class Clave {
    /*
     * Escribe un Algoritmo que pida un nombre de usuario y una contraseña y si se
     * ha introducido "user1" y "cch" se indica "Has entrado al sistema", sino que
     * indique si el usuario, la contraseña o ambos son incorrectos. proyecto:
     * claves
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        String usuario, contrasenia;
        System.out.print("Ingrese su Usuario: ");
        usuario = leer.nextLine();
        System.out.print("Ingrese su Contraseña: ");
        contrasenia = leer.nextLine();

        if (usuario.equals("user1") && contrasenia.equals("cch")) {
            System.out.println("Has ingresado al sistema.");
        } else if (!usuario.equals("user1") && contrasenia.equals("cch")) {
            System.out.println("Usuario Incorrecto.");
        } else if (usuario.equals("user1") && !contrasenia.equals("cch")) {
            System.out.println("Contraseña Incorrecto.");
        } else {
            System.out.println("Ambos son incorrectos.");
        }

        leer.close();
    }
}
