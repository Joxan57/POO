import java.util.InputMismatchException;
import java.util.Scanner;

public class p134_ExcepcionEdades {
    public static void main(String[] args) {
        int[] edades = new int[5];

        try (Scanner entrada = new Scanner(System.in)) {
            for (int i = 0; i < edades.length; i++) {
                boolean edadValida = false;
                while (!edadValida) {
                    try {
                        System.out.printf("Edad persona %d: ", i + 1);
                        System.out.flush();
                        edades[i] = entrada.nextInt();
                        edadValida = true;
                    } catch (InputMismatchException e) {
                        entrada.next();
                        System.out.println("Introduce un número entero");
                    }
                }
            }
        }

        System.out.println("# Captura terminada las edades son:");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println();
    }
}
