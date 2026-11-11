package p142_Archivos7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    public static void capturaDatos(Scanner teclado, ArrayList<Persona> datos) {
        while (true) {
            System.out.print("\nNombre (vacío para terminar): ");
            String nombre = teclado.nextLine().trim();
            if (nombre.isEmpty()) {
                break;
            }

            int edad = leerEntero(teclado, "Edad: ");
            double peso = leerDecimal(teclado, "Peso: ");
            System.out.print("Correo: ");
            String correo = teclado.nextLine().trim();
            datos.add(new Persona(nombre, edad, peso, correo));
        }
    }

    private static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String valor = teclado.nextLine();
            try {
                return Integer.parseInt(valor);
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número entero válido.");
            }
        }
    }

    private static double leerDecimal(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String valor = teclado.nextLine();
            try {
                return Double.parseDouble(valor);
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido.");
            }
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Persona> datos)
            throws IOException {
        try (ObjectOutputStream salida =
                new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(datos);
        }
    }

    public static void leerDatos(String archivo, ArrayList<Persona> datos)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream entrada =
                new ObjectInputStream(new FileInputStream(archivo))) {
            Object objeto = entrada.readObject();
            if (!(objeto instanceof ArrayList<?> leidos)) {
                throw new IOException("El archivo no contiene una lista de personas.");
            }

            ArrayList<Persona> personas = new ArrayList<>();
            for (Object elemento : leidos) {
                if (!(elemento instanceof Persona persona)) {
                    throw new IOException("El archivo contiene datos incompatibles.");
                }
                personas.add(persona);
            }
            datos.clear();
            datos.addAll(personas);
        }
    }

    public static void mostrarDatos(ArrayList<Persona> datos) {
        for (Persona persona : datos) {
            System.out.println(persona);
        }
    }
}
