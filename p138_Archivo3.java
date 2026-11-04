import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p138_Archivo3 {
    public static void main(String[] args) {
        File arch = new File("datos.txt");
        if (arch.exists()) {
            try(BufferedReader fnombres = new BufferedReader(new FileReader(arch))) {
                String nombre;
                while ((nombre = fnombres.readLine()) != null) {
                    System.out.println(nombre);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    }
}
