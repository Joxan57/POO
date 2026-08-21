import java.util.Scanner;

public class p022_VerificarSuma {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner obj = new Scanner(System.in);

        System.out.println("\033[H\033[2J");

        System.out.println("Dado 3 numeros, verifica si la suma del primero y el segundo es igual al tercero\n");

        System.out.println("Dame el primer numero : ");
        n1 = obj.nextInt();
        System.out.println("Dame el segundo numero : ");
        n2 = obj.nextInt();
        System.out.println("Dame el tercer numero : ");
        n3 = obj.nextInt();

        if (n1 + n2 == n3)

            System.out.println("Son iguales");

        else

            System.out.println("Son diferentes");

    }
}
