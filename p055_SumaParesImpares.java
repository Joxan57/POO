import java.util.Scanner;

public class p055_SumaParesImpares {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int op;

        do {
            System.out.println("Imprime los numeros pares o impares y su suma");
            System.out.println("Elige la opcion [1] Pares, [2] Impares, [3] Salir\n");

            op = obj.nextInt();

            int n, suma = 0;

            switch (op) {
                case 1:
                    System.out.println("Imprime pares y su suma de 1 a n");
                    System.out.print("Hasta donde quieres que llegue: ");
                    n = obj.nextInt();

                    for (int x = 2; x <= n; x += 2) {
                        System.out.println(x);
                        suma += x;
                    }

                    System.out.printf("La suma es: %d%n", suma);
                    break;

                case 2:
                    System.out.println("Imprime los impares del 1 a n");
                    System.out.print("Donde quieres que llegue: ");
                    n = obj.nextInt();

                    for (int x = 1; x <= n; x += 2) {
                        System.out.println(x);
                        suma += x;
                    }

                    System.out.printf("La suma es: %d%n", suma);
                    break;

                case 3:
                    System.out.println("Camara...");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (op != 3);
    }
}

