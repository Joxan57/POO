import java.util.Scanner;

public class p058_Piramide {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Cuantos Renlglones");
        int r = obj.nextInt();
        System.out.println("que caracter : ");
        char c = obj.next().charAt(0);

        for(int i = 1; i <= r; i++){
            for(int j=1; j<=i ; j++)
                System.out.println(c);
            System.out.println();
        }
    }
}
