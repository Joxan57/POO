package p142_Archivos7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String archivo = "personas.dat";
        ArrayList<Persona> datos = new ArrayList<>();

        try (Scanner teclado = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("""
                        ----- Procesamiento de personas -----
                        1. Capturar datos
                        2. Grabar datos en archivo
                        3. Leer datos de archivo
                        4. Mostrar datos
                        5. Salir
                        """);
                opcion = leerOpcion(teclado);

                try {
                    switch (opcion) {
                        case 1 -> Procesa.capturaDatos(teclado, datos);
                        case 2 -> {
                            if (datos.isEmpty()) {
                                System.out.println("No hay datos para grabar.");
                            } else {
                                Procesa.grabarDatos(archivo, datos);
                                System.out.println("Datos grabados.");
                            }
                        }
                        case 3 -> {
                            Procesa.leerDatos(archivo, datos);
                            System.out.println("Datos leídos.");
                        }
                        case 4 -> {
                            if (datos.isEmpty()) {
                                System.out.println("No hay datos para mostrar.");
                            } else {
                                Procesa.mostrarDatos(datos);
                            }
                        }
                        case 5 -> System.out.println("Saliendo del sistema...");
                        default -> System.out.println("Opción inválida.");
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Error con el archivo: " + e.getMessage());
                }
            } while (opcion != 5);
        }
    }

    private static int leerOpcion(Scanner teclado) {
        System.out.print("Elige una opción: ");
        String valor = teclado.nextLine();
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
