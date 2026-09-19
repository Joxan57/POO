import java.util.InputMismatchException;
import java.util.Scanner;

public class p080_SimuladorFinanciero {

    /**
     * Calcula el valor acumulado de un plan de ahorro mediante aportaciones
     * mensuales y la aplicación del interés mensual durante un plazo
     * determinado.
     *
     * @param aportacion cantidad depositada cada mes
     * @param meses duración del plan de ahorro en meses
     * @param tasaAnual tasa de rendimiento anual en formato decimal
     *                  (por ejemplo, 0.05 representa 5 %)
     * @return valor acumulado del plan de ahorro
     */
    public static double calcularAhorro(
            double aportacion,
            int meses,
            double tasaAnual) {
        if (!Double.isFinite(aportacion) || aportacion <= 0
                || meses <= 0 || !Double.isFinite(tasaAnual)
                || tasaAnual <= 0) {
            throw new IllegalArgumentException(
                    "La aportacion, los meses y la tasa anual deben ser positivos.");
        }

        double montoAcumulado = 0.0;
        double tasaMensual = tasaAnual / 12;

        for (int mes = 1; mes <= meses; mes++) {
            montoAcumulado += aportacion;
            montoAcumulado += montoAcumulado * tasaMensual;
        }

        return montoAcumulado;
    }

    /**
     * Calcula el monto final de una inversión a plazo fijo utilizando interés
     * compuesto.
     *
     * @param capital cantidad invertida al inicio
     * @param tasa tasa de interés anual en formato decimal
     *             (por ejemplo, 0.05 representa 5 %)
     * @param anios duración de la inversión en años
     * @return monto final de la inversión
     */
    public static double calcularInteresCompuesto(
            double capital,
            double tasa,
            int anios) {
        if (!Double.isFinite(capital) || capital <= 0
                || !Double.isFinite(tasa) || tasa <= 0 || anios <= 0) {
            throw new IllegalArgumentException(
                    "El capital, la tasa y los anios deben ser positivos.");
        }

        return capital * Math.pow(1 + tasa, anios);
    }

    /**
     * Determina el perfil de riesgo del usuario a partir de su edad y capital
     * disponible.
     *
     * @param edad edad del usuario en años
     * @param monto capital disponible para invertir
     * @return descripción del perfil financiero identificado
     * @throws IllegalArgumentException si la edad o el monto no son positivos
     */
    public static String obtenerPerfil(
            int edad,
            double monto) {
        if (edad <= 0 || monto <= 0) {
            throw new IllegalArgumentException(
                    "La edad y el monto deben ser positivos.");
        }

        if (edad < 30 && monto > 10000) {
            return "Agresivo";
        } else if (edad > 50) {
            return "Conservador";
        } else {
            return "Moderado";
        }
    }

    /**
     * Inicia la interacción del simulador financiero desde la consola.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SIMULADOR FINANCIERO ===");
            System.out.println("1. Calcular ahorro mensual");
            System.out.println("2. Proyección de inversión a plazo fijo");
            System.out.println("3. Obtener perfil de riesgo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Aportación mensual: ");
                        double aportacion = scanner.nextDouble();
                        System.out.print("Número de meses: ");
                        int meses = scanner.nextInt();
                        System.out.print("Tasa anual decimal (0.05 = 5 %): ");
                        double tasaAhorro = scanner.nextDouble();
                        scanner.nextLine();

                        double ahorro = calcularAhorro(
                                aportacion, meses, tasaAhorro);
                        System.out.printf(
                                "Monto acumulado: %.2f%n", ahorro);
                        break;
                    case 2:
                        System.out.print("Capital inicial: ");
                        double capital = scanner.nextDouble();
                        System.out.print("Tasa anual decimal (0.05 = 5 %): ");
                        double tasaInversion = scanner.nextDouble();
                        System.out.print("Número de años: ");
                        int anios = scanner.nextInt();
                        scanner.nextLine();

                        double montoFinal = calcularInteresCompuesto(
                                capital, tasaInversion, anios);
                        System.out.printf(
                                "Monto final de la inversión: %.2f%n",
                                montoFinal);
                        break;
                    case 3:
                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        System.out.print("Monto disponible: ");
                        double monto = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println(
                                "Perfil de riesgo: "
                                        + obtenerPerfil(edad, monto));
                        break;
                    case 4:
                        System.out.println("Gracias por utilizar el simulador.");
                        break;
                    default:
                        System.out.println(
                                "Opción inválida. Selecciona del 1 al 4.");
                }
            } catch (InputMismatchException exception) {
                System.out.println(
                        "Entrada inválida. Debes introducir un número.");
                scanner.nextLine();
                opcion = 0;
            } catch (IllegalArgumentException exception) {
                System.out.println("Error: " + exception.getMessage());
                opcion = 0;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
