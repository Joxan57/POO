

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p144_ArchivoMaterias {
    public static void main(String[] args) {
        Path archivo = Path.of("materias.txt");

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce materias cursadas (separadas por coma): ");
            String linea = teclado.nextLine();
            List<String> materias = Arrays.stream(linea.split(","))
                    .map(String::trim)
                    .filter(materia -> !materia.isEmpty())
                    .toList();

            if (materias.isEmpty()) {
                System.out.println("No se ingresaron materias.");
                return;
            }

            System.out.println("Escribiendo materias en el archivo...");
            try (BufferedWriter salida =
                    Files.newBufferedWriter(archivo, StandardCharsets.UTF_8)) {
                for (String materia : materias) {
                    salida.write(materia);
                    salida.newLine();
                }
            }
            System.out.println("Datos guardados con éxito.");

            System.out.println("\nLeyendo materias desde el archivo:");
            try (BufferedReader entrada =
                    Files.newBufferedReader(archivo, StandardCharsets.UTF_8)) {
                String materia;
                while ((materia = entrada.readLine()) != null) {
                    System.out.println("- " + materia);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
