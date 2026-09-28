import java.util.Scanner;

public class p033_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el primer numero");
        n1 = obj.nextInt();
        System.out.println("Dame el segundo numero");
        n2 = obj.nextInt();
        System.out.println("Dame el tercer numero");
        n3 = obj.nextInt();

        if (n1 + 1 == n2 && n2 + 1 == n3) {
            System.out.println("Los numeros son consecutivos");
        } else
            System.out.println("Los numeros no son consecutivos");

    }
}
