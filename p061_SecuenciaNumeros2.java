import java.util.Scanner;

public class p061_SecuenciaNumeros2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        System.out.print("Cuantos renglones? "); int n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            
            // Bucle interno: imprime el número 'i', 'i' veces
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}