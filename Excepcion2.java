import java.util.Scanner;
import java.util.InputMismatchException;
public class Excepcion2 {
    Scanner obj = new Scanner(System.in);
    int numero = 0;
    
    try {
        System.out.println("Dame un numero entero : ");
        numero = obj.nextInt();

        System.out.println("El numero que pusiste + 5 es : " + (numero+5));
    }
    
}