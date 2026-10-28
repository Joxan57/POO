import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p130_Excepcion6 {
    public static void main(String[] args) {
        
        File archivo = new File("nombre.txt");

        try (Scanner lector = new Scanner(archivo)){

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }


        }catch (FileNotFoundException e) {
            System.out.println("Error: No se encontro el archivo");
        }   catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
