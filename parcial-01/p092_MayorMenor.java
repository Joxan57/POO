import java.util.ArrayList;
import java.util.Scanner;

void main() {
    Scanner obj = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.print("Cuántos números deseas capturar? ");
    int n = obj.nextInt();

    for (int pos = 0; pos < n; pos++) {
        System.out.printf("Número %d: ", pos + 1);
        numeros.add(obj.nextInt());
    }

    System.out.println("\nElementos del arreglo : ");
    for (Integer numero : numeros)
        System.out.printf("%d ", numero);

    int mayor = numeros.get(0);
    int menor = numeros.get(0);

    for (Integer numero : numeros) {
        if (numero > mayor)
            mayor = numero;

        if (numero < menor)
            menor = numero;
    }

    System.out.printf("%nEl número mayor es: %d%n", mayor);
    System.out.printf("El número menor es: %d%n", menor);
}
