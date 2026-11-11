package p145_ArchivoEstudiante;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Procesa {
    public static void capturaDatos(Scanner teclado, ArrayList<Estudiante> datos) {
        while (true) {
            System.out.print("\nNombre (vacío para terminar): ");
            String nombre = teclado.nextLine().trim();
            if (nombre.isEmpty()) {
                break;
            }

            int edad = leerEdad(teclado);
            double promedio = leerPromedio(teclado);
            String sexo = leerSexo(teclado);
            datos.add(new Estudiante(nombre, edad, promedio, sexo));
        }
    }

    private static int leerEdad(Scanner teclado) {
        while (true) {
            System.out.print("Edad: ");
            try {
                int edad = Integer.parseInt(teclado.nextLine().trim());
                if (edad > 0) {
                    return edad;
                }
            } catch (NumberFormatException e) {
                // Se solicita el dato otra vez.
            }
            System.out.println("Ingresa una edad válida mayor que cero.");
        }
    }

    private static double leerPromedio(Scanner teclado) {
        while (true) {
            System.out.print("Promedio (0 a 10): ");
            try {
                double promedio = Double.parseDouble(
                        teclado.nextLine().trim().replace(',', '.'));
                if (Double.isFinite(promedio) && promedio >= 0 && promedio <= 10) {
                    return promedio;
                }
            } catch (NumberFormatException e) {
                // Se solicita el dato otra vez.
            }
            System.out.println("Ingresa un promedio válido entre 0 y 10.");
        }
    }

    private static String leerSexo(Scanner teclado) {
        while (true) {
            System.out.print("Sexo (Hombre/Mujer): ");
            String sexo = teclado.nextLine().trim();
            if (sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("hombre")) {
                return "Hombre";
            }
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("mujer")) {
                return "Mujer";
            }
            System.out.println("Ingresa Hombre (H) o Mujer (M).");
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos)
            throws IOException {
        try (ObjectOutputStream salida =
                new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(datos);
        }
    }

    public static void leerDatos(String archivo, ArrayList<Estudiante> datos)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream entrada =
                new ObjectInputStream(new FileInputStream(archivo))) {
            Object objeto = entrada.readObject();
            if (!(objeto instanceof ArrayList<?> leidos)) {
                throw new IOException("El archivo no contiene una lista de estudiantes.");
            }

            ArrayList<Estudiante> estudiantes = new ArrayList<>();
            for (Object elemento : leidos) {
                if (!(elemento instanceof Estudiante estudiante)) {
                    throw new IOException("El archivo contiene datos incompatibles.");
                }
                estudiantes.add(estudiante);
            }
            datos.clear();
            datos.addAll(estudiantes);
        }
    }

    public static void mostrarDatos(ArrayList<Estudiante> datos) {
        for (Estudiante estudiante : datos) {
            System.out.println(estudiante);
        }
    }

    public static void mostrarEstadisticas(ArrayList<Estudiante> datos) {
        if (datos.isEmpty()) {
            System.out.println("No hay estudiantes para calcular estadísticas.");
            return;
        }

        double sumaPromedios = 0;
        double sumaEdades = 0;
        int hombres = 0;
        int mujeres = 0;
        for (Estudiante estudiante : datos) {
            sumaPromedios += estudiante.getPromedio();
            sumaEdades += estudiante.getEdad();
            if (estudiante.getSexo().equalsIgnoreCase("Hombre")) {
                hombres++;
            } else if (estudiante.getSexo().equalsIgnoreCase("Mujer")) {
                mujeres++;
            }
        }

        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.printf(Locale.ROOT, "Promedio de calificaciones: %.2f%n",
                sumaPromedios / datos.size());
        System.out.printf(Locale.ROOT, "Promedio de edades: %.1f años%n",
                sumaEdades / datos.size());
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}
