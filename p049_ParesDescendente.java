import java.util.Scanner;

public class p049_ParesDescendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        char op;

        System.out.println("Imprime los numeros pares desde 100 hasta n ");
        do {
            System.out.print("Dame hasta que numero quieres llegar ");
            int n = obj.nextInt();
            int ini = 100, suma = 0, contador = 0;
            
            
            while (ini >= n) {
                System.out.print(ini + " ");
                suma += ini;
                ini -= 2; 
                contador++;
            }

            System.out.printf("\nLa suma es de : %d\n", suma);
            
            if (contador > 0) {
                System.out.printf("El promedio es de : %.1f\n", (double) suma / contador);
            }
            
            System.out.print("¿Deseas continuar (S/N)? \n");
            op = Character.toUpperCase(obj.next().charAt(0));

        } while (op != 'N');
        
        System.out.println("camara...");
    }
}
