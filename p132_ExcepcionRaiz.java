import java.util.Locale;
import java.util.Scanner;

public class p132_ExcepcionRaiz {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Introduce un número: ");
                    System.out.flush();
                    float numero = Float.parseFloat(entrada.next());
                    if (numero < 0) {
                        throw new Exception();
                    }

                    System.out.printf(
                            Locale.US,
                            "El resultado es: %.2f%n",
                            Math.sqrt(numero));
                    break;
                } catch (Exception e) {
                    System.out.println("Error no puedo calcular la raíz cuadrada");
                }
            }
        }
    }
}
