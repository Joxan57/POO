import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class p135_ExcepcionTemperatura {
    public static class TemperturaExcesiva extends Exception {
        public TemperturaExcesiva(String mensaje) {
            super(mensaje);
        }
    }

    private static double convertirAFahrenheit(double centigrados)
            throws TemperturaExcesiva {
        if (centigrados > 100) {
            throw new TemperturaExcesiva(
                    "Temperatura demasiado alta, no se puede convertir");
        }
        return centigrados * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Dame una temperatura en centígrados: ");
                    System.out.flush();
                    double centigrados = entrada.nextDouble();
                    double fahrenheit = convertirAFahrenheit(centigrados);
                    System.out.printf(
                            Locale.US,
                            "%.2f grados centígrados, equivale a %.2f grados fahrenheit%n",
                            centigrados,
                            fahrenheit);
                    break;
                } catch (InputMismatchException e) {
                    entrada.next();
                    System.out.println(
                            "La temperatura a convertir, debe ser un valor numérico");
                } catch (TemperturaExcesiva e) {
                    System.out.println(
                            "Error : p135_ExcepcionTemperatura.TemperturaExcesiva: "
                                    + e.getMessage());
                }
            }
        }
    }
}
