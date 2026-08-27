import java.util.Scanner;

public class p034_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner obj = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Dados 3 numeros enteros calcular cual es el mayor\n");

        System.out.println("Dame el primer numero :");
        n1 = obj.nextInt();
        System.out.println("Dame el segundo numero :");
        n2 = obj.nextInt();
        System.out.println("Dame el tercer numero :");
        n3 = obj.nextInt();

        if (n1 > n2 && n1 > n3)
            System.out.println("El mayor es el numero 1;");

        if (n2 > n3 && n2 > n1)
            System.out.println("El mayor es el numero 2;");

        if (n3 > n1 && n3 > n2)
            System.out.println("El mayor es el numero 3 ;");

        if (n1 == n2 && n2 == n3 && n3 == n1)
            System.out.println("Son iguales");

    }
}
