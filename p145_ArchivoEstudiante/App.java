package p145_ArchivoEstudiante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String archivo = "estudiantes.dat";
        ArrayList<Estudiante> datos = new ArrayList<>();

        try (Scanner teclado = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("""
                        --- MENÚ ---
                        1. Capturar datos
                        2. Grabar datos
                        3. Leer datos
                        4. Mostrar datos
                        5. Calcular estadísticas
                        6. Salir
                        """);
                opcion = leerOpcion(teclado);

                try {
                    switch (opcion) {
                        case 1 -> Procesa.capturaDatos(teclado, datos);
                        case 2 -> {
                            if (datos.isEmpty()) {
                                System.out.println("No hay estudiantes para grabar.");
                            } else {
                                Procesa.grabarDatos(archivo, datos);
                                System.out.println("Datos grabados con éxito.");
                            }
                        }
                        case 3 -> {
                            Procesa.leerDatos(archivo, datos);
                            System.out.println("Datos leídos con éxito.");
                        }
                        case 4 -> {
                            if (datos.isEmpty()) {
                                System.out.println("No hay estudiantes para mostrar.");
                            } else {
                                Procesa.mostrarDatos(datos);
                            }
                        }
                        case 5 -> Procesa.mostrarEstadisticas(datos);
                        case 6 -> System.out.println("Saliendo del sistema...");
                        default -> System.out.println("Opción inválida.");
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Error al procesar el archivo: " + e.getMessage());
                }
            } while (opcion != 6);
        }
    }

    private static int leerOpcion(Scanner teclado) {
        System.out.print("Elige una opción: ");
        try {
            return Integer.parseInt(teclado.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
