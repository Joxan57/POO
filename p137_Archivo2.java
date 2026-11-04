import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class p137_Archivo2 {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Maria", "Teresa", "Ana"};
        File arch = new File("nombres.txt");
        
        if (arch.exists()) {
            System.out.println("El archivo ya existe");
            return;
        } else {
            try (BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch))) {
                for (String nombre : nombres) {
                    fnombres.write(nombre + "\n");
                }
                System.out.println("Archivo creado correctamente");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());

            }
        }
    }
}
