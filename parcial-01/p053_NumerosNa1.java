import java.util.Scanner;

public class p053_NumerosNa1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);

        System.out.println("Imprime los  numeros del n al 1");
        System.out.println("Donde quieres comenzar: "); int n = obj.nextInt();
        System.out.println("Cual quieres que sea el decremeto\n:  "); int m = obj.nextInt();

        for (int x = n;  x>=1; x -= m ){
            System.out.println(x);
        }
        System.out.println();
    }
}
