import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("¿Cuántos términos? "); 
        int n = obj.nextInt();

        double suma = 0.0;

        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;

            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print("+1/" + i);
            }
        }

        System.out.println();
        System.out.println("Suma " + suma);

        obj.close();
    }
}