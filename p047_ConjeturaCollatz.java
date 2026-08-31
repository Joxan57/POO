import java.util.Scanner;

public class p047_ConjeturaCollatz {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.println("Calcula la conjetura de collatz\n");
        System.out.println("Dame n :"); int n = obj.nextInt();

        do {
            System.out.printf("%d ", n);
            if (n%2 ==0)
                n = n / 2;
            else
                n = n * 3 + 1;

        }while (n != 1);
        System.out.printf("%d ", n);
        
    }
}
