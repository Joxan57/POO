import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class p140_Archivo5 {
    public static void main(String[] args) {
        File archivo = new File("datos.dat");

        try (DataOutputStream salida = new DataOutputStream(new FileOutputStream(archivo))) {
            salida.writeUTF("Ana");
            salida.writeInt(30);
            salida.writeDouble(60.5);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        try (DataInputStream entrada = new DataInputStream(new FileInputStream(archivo))) {
            System.out.println("Nombre: " + entrada.readUTF());
            System.out.println("Edad: " + entrada.readInt());
            System.out.println("Peso: " + entrada.readDouble());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
    