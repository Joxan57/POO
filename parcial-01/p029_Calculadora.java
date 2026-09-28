import java.util.Scanner;

public class p029_Calculadora {
    public static void main(String[] args) {
        float n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Calculadora basica\n");
        System.out.print("Dame el número 1 : ");
        n1 = obj.nextFloat();
        System.out.print("Dame el número 2 : ");
        n2 = obj.nextFloat();
        System.out.print("Que operacion ( + - * / ^ ) ? : ");
        op = obj.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("La suma de %.2f + %.2f es igual a : %.2f", n1, n2, n1 + n2);

                break;
            case '-':
                System.out.printf("La resta de %.2f + %.2f es igual a : %.2f", n1, n2, n1 - n2);

                break;
            case '*':
                System.out.printf("La multiplicacion de %.2f + %.2f es igual a : %.2f", n1, n2, n1 * n2);

                break;
            case '/':
                System.out.printf("La division de %.2f + %.2f es igual a : %.2f", n1, n2, n1 / n2);

                break;
            case '^':
                System.out.printf("La potencia de %.2f ^ %.2f es igual a : %.2f", n1, n2, Math.pow(n1, n2));

                break;

            default:
                System.out.println("Operador no valido");
                break;
        }

    }

}
