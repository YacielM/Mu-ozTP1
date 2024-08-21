import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Perros {

    public static void main(String[] args) {
        ArrayList<String> razasDePerros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.print("Ingresa una raza de perro (o 'salir' para terminar): ");
            String raza = leer.nextLine();

            if (raza.equalsIgnoreCase("salir")) {
                break;
            }

            razasDePerros.add(raza);
        }

        System.out.println("\nRazas de perros guardadas:");
        for (String raza : razasDePerros) {
            System.out.println(raza);
        }

        System.out.print("\nIngresa una raza de perro para buscar y eliminar: ");
        String razaABuscar = leer.nextLine();

        Iterator<String> iterator = razasDePerros.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String razaActual = iterator.next();
            if (razaActual.equalsIgnoreCase(razaABuscar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Perro eliminado. Lista actualizada:");
        } else {
            System.out.println("El perro no se encuentra en la lista. Lista actual:");
        }

        for (String raza : razasDePerros) {
            System.out.println(raza);
        }
    }
    
}
