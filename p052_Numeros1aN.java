import java.util.Scanner;

public class p052_Numeros1aN {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        System.out.println("Imprime los  numeros del 1 al 100");
        System.out.println("hasta donde quieres que llegue: "); int n = obj.nextInt();
        System.out.println("Cual quieres que sea el incremento:  "); int m = obj.nextInt();

        for (int x = 0;  x<=n; x += m){
            System.out.println(x);
        }
    }
}