import java.util.Scanner;

public class p051_SerieFibonaci {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        char op;

        do {
            System.out.print("Número de términos que deseas imprimir?: ");
            int n = obj.nextInt();
            
            System.out.printf("Los primeros %d términos de la sucesión Fibonacci son:\n", n);
            
            int a = 0, b = 1, contador = 1;
            
            while (contador <= n) {
                System.out.print(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
                contador++;
            }
            System.out.println();
            
            System.out.print("¿Deseas continuar (S/N)? \n");
            op = Character.toUpperCase(obj.next().charAt(0));

        } while (op != 'N');
        System.out.println("camara...");
    }
}