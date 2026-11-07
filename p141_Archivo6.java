import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class p141_Archivo6 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> datos = new ArrayList<>();
    static String archivo = "datos.dat";

    static void capturar() {
        System.out.println(
                "\nEscribe datos (<Enter> vacío para terminar):");
        String linea;
        while (!(linea = sc.nextLine()).isEmpty()) {
            datos.add(linea);
        }
    }

    static void grabar() {
        if (datos.isEmpty()) {
            System.out.println("\nNo hay datos para grabar.");
            return;
        }
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(archivo))) {
            dos.writeInt(datos.size());
            for (String d : datos)
                dos.writeUTF(d);
            System.out.println("\nDatos grabados con éxito.");
        } catch (IOException e) {
            System.out.println("\nError al grabar: " + e.getMessage());
        }
    }

    static void leer() {
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(archivo))) {
            datos.clear();
            int total = dis.readInt();
            for (int i = 0; i < total; i++)
                datos.add(dis.readUTF());
            System.out.println("\nDatos cargados con éxito.");
        } catch (IOException e) {
            System.out.println("\nError al leer archivo: "
                    + e.getMessage());
        }
    }

    static void mostrar() {
        if (datos.isEmpty()) {
            System.out.println("\nNo hay datos para mostrar.");
            return;
        }
        System.out.println("\nDatos registrados:");
        for (String d : datos)
            System.out.println("- " + d);
    }

    public static void main(String[] args) {
        int opc;
        do {
            System.out.println("""
                    \nProcesamiento de datos Binarios
                    1. Capturar datos en memoria
                    2. Grabar datos en disco
                    3. Leer Datos de Disco
                    4. Mostrar Datos en pantalla
                    5. Salir
                    Elija una opción:
                    """);
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> capturar();
                case 2 -> grabar();
                case 3 -> leer();
                case 4 -> mostrar();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida");
            }
        } while (opc != 5);
    }

}
