import java.util.ArrayList;
import java.util.Scanner;

void main() {
    Scanner obj = new Scanner(System.in);

    ArrayList<Float> calificaciones = new ArrayList<>();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.print("Cuántas calificaciones deseas capturar? ");
    int n = obj.nextInt();

    for (int pos = 0; pos < n; pos++) {
        System.out.printf("Calificación %d: ", pos + 1);
        calificaciones.add(obj.nextFloat());
    }

    System.out.println("\nElementos del arreglo : ");
    for (Float calificacion : calificaciones)
        System.out.printf("%.1f ", calificacion);

    float suma = 0;

    for (Float calificacion : calificaciones)
        suma += calificacion;

    float promedio = suma / calificaciones.size();

    System.out.printf("%nSuma: %.1f%n", suma);
    System.out.printf("Promedio: %.1f%n", promedio);

    System.out.println("Elementos mayores al promedio: ");

    int cantidad = 0;

    for (Float calificacion : calificaciones)
        if (calificacion > promedio) {
            System.out.printf("%.1f ", calificacion);
            cantidad++;
        }

    System.out.printf("%nTotal de elementos mayores al promedio: %d%n", cantidad);
}
