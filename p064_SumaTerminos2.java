import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("¿Cuántos términos? ");
        int n = obj.nextInt();

        long termino = 0;
        long suma = 0;

        for (int i = 1; i <= n; i++) {
            termino = (termino * 10) + 1;
            suma += termino;

            if (i == 1) {
                System.out.print(termino);
            } else {
                System.out.print("+" + termino);
            }
        }

        System.out.println();
        System.out.println("suma " + suma);

        obj.close();
    }
}