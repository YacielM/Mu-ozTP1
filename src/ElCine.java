import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ElCine {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<Pelicula> listaPeliculas = new ArrayList<>();

        while (true) {
            System.out.println("Ingresa el titulo de la pelicula (o 'salir' para terminar): ");
            String titulo = leer.nextLine();

            if (titulo.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingresa el director de la pelicula: ");
            String director = leer.nextLine();

            System.out.println("Ingresa la duracion de la pelicula (en horas): ");
            double duracion = leer.nextDouble();
            leer.nextLine(); 

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            listaPeliculas.add(pelicula);
        }

        System.out.println("\nTodas las peliculas:");
        listaPeliculas.forEach(System.out::println);

        List<Pelicula> copiaPeliculas = new ArrayList<>(listaPeliculas);

        System.out.println("\nPeliculas con duracion mayor a 1 hora:");
        for (Pelicula pelicula : copiaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }

        copiaPeliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("\nPeliculas ordenadas por duracion (de mayor a menor):");
        copiaPeliculas.forEach(System.out::println);

        copiaPeliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("\nPeliculas ordenadas por duracion (de menor a mayor):");
        copiaPeliculas.forEach(System.out::println);

        copiaPeliculas.sort(Comparator.comparing(Pelicula::getTitulo));
        System.out.println("\nPeliculas ordenadas por titulo:");
        copiaPeliculas.forEach(System.out::println);

        copiaPeliculas.sort(Comparator.comparing(Pelicula::getDirector));
        System.out.println("\nPeliculas ordenadas por director:");
        copiaPeliculas.forEach(System.out::println);
    }
    }

