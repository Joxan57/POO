import java.util.Scanner;

public class p040_Numeros100a1 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int num;
        System.out.println(" Desde donde quieres comenzar? ");
        num = obj.nextInt();

        while( num >= 1 ){
            System.out.println(num);
            num = num - 1;            
        }
        System.out.println("\nProceso terminado...");
    }
}