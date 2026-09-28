import java.util.Scanner;

public class p039_Numeros1a100 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        int num, num2;
        System.out.println("a que numero quieres llegar?"); num2 = obj.nextInt();

        num = 0;

        while( num <= num2 ){
            System.out.print(num + " ");
            num = num + 1;            
        }
        System.out.println("\nProceso terminado");
    }
    
}
