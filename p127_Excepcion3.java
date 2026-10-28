import java.util.Scanner;
import java.util.InputMismatchException;

public class p127_Excepcion3 {
    public static void main(String[] args) {
        int numerador, denominador, resultado;
        Scanner obj = new Scanner(System.in);

        try{
            System.out.println("Dame el numerador");
            numerador = obj.nextInt();
            System.out.println("Dame el denominador");
            denominador = obj.nextInt();
            resultado = numerador / denominador;
            System.out.println("El resultado de la division es : " + resultado);

        }catch(InputMismatchException e){
            System.out.println("Error: Debes introducir un numero entero");
        }catch(ArithmeticException e){
            System.out.println("Error: No se puede dividir entre cero");
        }
    }
}

