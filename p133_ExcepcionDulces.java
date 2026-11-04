import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class p133_ExcepcionDulces {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            while (true) {
                int ninos = 0;
                int dulces = 0;

                try {
                    System.out.print("Número de niños en el barrio : ");
                    System.out.flush();
                    ninos = entrada.nextInt();
                    System.out.print("Cantidad de dulces existente : ");
                    System.out.flush();
                    dulces = entrada.nextInt();

                    if (ninos == 0 || dulces == 0) {
                        throw new ArithmeticException();
                    }

                    double dulcesPorNino = (double) dulces / ninos;
                    System.out.printf(
                            Locale.US,
                            "A cada niño le tocan %.2f dulces.%n",
                            dulcesPorNino);
                    break;
                } catch (InputMismatchException e) {
                    entrada.next();
                    System.out.println(
                            "Los niños y los dulces, deben ser cantidades numéricas");
                } catch (ArithmeticException e) {
                    if (dulces == 0) {
                        System.out.println("Si no hay dulces, no puedo repartir dulces");
                    } else {
                        System.out.println("El número de niños no puede ser cero");
                    }
                }
            }
        }
    }
}
//