

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class p143_ArchivoMunicipios {
    public static void main(String[] args) {
        List<String> deportes = List.of(
                "Fútbol",
                "Béisbol",
                "Ciclismo",
                "Atletimso",
                "Natación",
                "Motociclismo");
        Path archivo = Path.of("deportes.txt");

        try {
            System.out.println("Escribiendo datos en el archivo...");
            try (BufferedWriter salida =
                    Files.newBufferedWriter(archivo, StandardCharsets.UTF_8)) {
                for (String deporte : deportes) {
                    salida.write(deporte);
                    salida.newLine();
                }
            }
            System.out.println("Datos escritos correctamente.");

            System.out.println("\nLeyendo datos del archivo:");
            try (BufferedReader entrada =
                    Files.newBufferedReader(archivo, StandardCharsets.UTF_8)) {
                String deporte;
                while ((deporte = entrada.readLine()) != null) {
                    System.out.println(deporte);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
