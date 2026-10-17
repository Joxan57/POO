package p102_AutorLibro;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        libros.add(new Libro("978-607-000001-1", "El principito",
                new Autor("Antoine de Saint-Exupery", "antoine@example.com"), 180.00, 5));
        libros.add(new Libro("978-607-000002-8", "Cien anos de soledad",
                new Autor("Gabriel Garcia Marquez", "gabriel@example.com"), 250.00, 3));
        libros.add(new Libro("978-607-000003-5", "Don Quijote de la Mancha",
                new Autor("Miguel de Cervantes", "miguel@example.com"), 320.00, 2));
        libros.add(new Libro("978-607-000004-2", "La vuelta al mundo en 80 dias",
                new Autor("Julio Verne", "julio@example.com"), 195.00, 4));
        libros.add(new Libro("978-607-000005-9", "Orgullo y prejuicio",
                new Autor("Jane Austen", "jane@example.com"), 210.00, 6));
        libros.add(new Libro("978-607-000006-6", "Frankenstein",
                new Autor("Mary Shelley", "mary@example.com"), 175.00, 3));

        double sumaPrecios = 0;
        double totalDinero = 0;
        int totalEjemplares = 0;

        System.out.println("Datos de los libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
            sumaPrecios += libro.getPrecio();
            totalDinero += libro.getPrecio() * libro.getCant();
            totalEjemplares += libro.getCant();
        }

        double promedioPrecio = sumaPrecios / libros.size();
        System.out.printf("%nPromedio de precio: $%.2f%n", promedioPrecio);
        System.out.println("Total de libros registrados: " + libros.size());
        System.out.println("Total de ejemplares: " + totalEjemplares);
        System.out.printf("Total de dinero (precio por cantidad): $%.2f%n", totalDinero);
    }
}
