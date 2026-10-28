import java.util.InputMismatchException;
import java.util.Scanner;

public class p126_Excepcion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.print("Dame un valor: ");
            int valor = obj.nextInt();
            System.out.println("Nuevo valor: " + (valor + 5));
        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número entero");
        }
    }
}
    
