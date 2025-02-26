import java.util.Scanner;

public class Pizzeria {
    /*
     * 18. La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a
     * sus clientes. Los ingredientes para cada tipo de pizza aparecen a
     * continuación.
     * 
     * Ingredientes vegetarianos: Pimiento y tofu. Ingredientes no vegetarianos:
     * Pepperoni, Jamón y Salmón.
     * 
     * Algoritmo que pregunte al usuario si quiere una pizza vegetariana o no, y en
     * función de su respuesta le muestre un menú con los ingredientes disponibles
     * para que elija. Solo se puede elegir un ingrediente además de la mozzarella y
     * el tomate que están en todas la pizzas. Al final se debe mostrar por pantalla
     * si la pizza elegida es vegetariana o no y todos los ingredientes que lleva.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("¿Desea una pizza vegetariana? (si/no): ");
        String tipoPizza = leer.nextLine().trim().toLowerCase();

        String ingredienteExtra = "";
        boolean esVegetariana = tipoPizza.equals("si");

        if (esVegetariana) {
            System.out.println("Elija un ingrediente vegetariano:");
            System.out.println("1. Pimiento");
            System.out.println("2. Tofu");
        } else {
            System.out.println("Elija un ingrediente no vegetariano:");
            System.out.println("1. Pepperoni");
            System.out.println("2. Jamón");
            System.out.println("3. Salmón");
        }

        int opcion = leer.nextInt();
        leer.nextLine();

        if (esVegetariana) {
            ingredienteExtra = (opcion == 1) ? "Pimiento" : "Tofu";
        } else {
            switch (opcion) {
                case 1:
                    ingredienteExtra = "Pepperoni";
                    break;
                case 2:
                    ingredienteExtra = "Jamón";
                    break;
                case 3:
                    ingredienteExtra = "Salmón";
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        System.out.println("\nHas elegido una pizza " + (esVegetariana ? "vegetariana" : "no vegetariana") + ".");
        System.out.println("Ingredientes: Mozzarella, Tomate, " + ingredienteExtra + ".");

        leer.close();
    }
}
