import java.util.ArrayList;
import java.util.Random;

public class p093_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        Random aleatorio = new Random();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int pos = 0; pos < MAX; pos++) {
            int numero = aleatorio.nextInt(21);
            a.add(numero);
            if (numero % 2 == 0)
                b.add(numero);
        }

        System.out.println("Elementos del arreglo a[]:");
        for (Integer numero : a)
            System.out.printf("%d ", numero);

        System.out.println("\n\nElementos pares:");
        for (Integer numero : b)
            System.out.printf("%d ", numero);

        System.out.println("\n\nElementos impares:");
        int cantidadImpares = 0;
        for (Integer numero : a)
            if (numero % 2 != 0) {
                System.out.printf("%d ", numero);
                cantidadImpares++;
            }

        System.out.printf("%n%nCantidad de pares: %d%n", b.size());
        System.out.printf("Cantidad de impares: %d%n", cantidadImpares);
    }
}
