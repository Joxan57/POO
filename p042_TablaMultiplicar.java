import java.util.Scanner;

public class p042_TablaMultiplicar {
    public static void main(String[] args) {
        int c, t, n;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.println("Imprimir la tabla deseada de 1 a 10\n");
        System.out.print("Que tabla quieres ? ");
        t = obj.nextInt();
        System.out.print("Hasta donde ? ");
        n = obj.nextInt();
        c = 1;

        while (c <= n) {
            System.out.printf("%d x %d = %d\n", t, c, c * t);
            c  = c + 1;
        }
        System.out.println("\nProceso terminado");
    }
}