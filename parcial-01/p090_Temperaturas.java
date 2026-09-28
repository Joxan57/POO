import java.util.ArrayList;
import java.util.List;

void main() {
    ArrayList<Float> temperaturas = new ArrayList<>(
            List.of(2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f));

    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.printf("Primer elemento : %.2f%n", temperaturas.get(0));
    System.out.printf("Tercer elemento : %.2f%n", temperaturas.get(2));

    System.out.println("Elementos del arreglo : ");
    for (Float temperatura : temperaturas)
        System.out.printf("%.2f ", temperatura);

    for (int pos = 0; pos <= temperaturas.size() - 1; pos++)
        if (temperaturas.get(pos) > 10)
            temperaturas.set(pos, 0.0f);

    System.out.println("\nElementos modificados : ");
    for (Float temperatura : temperaturas)
        System.out.printf("%.2f ", temperatura);
}