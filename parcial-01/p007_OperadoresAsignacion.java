import java.util.Scanner;

public class p007_OperadoresAsignacion {
    public static void main(String[] args) {

        System.out.println("Ejemplo de uso de los operadores de asignacion e incremento\n");
        System.out.println("Dame un numero entero : ");

        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextInt();
        scanner.close();

        System.out.printf("El valor original es : %.2f \n", num);
        System.out.printf("Incrementar en 1     : %.2f \n", ++num);
        System.out.printf("Sumar 80             : %.2f \n", num+=80);
        System.out.printf("Restar 35            : %.2f \n", num-=35);
        System.out.printf("Multiplicar por 15   : %.2f \n", num*=15);
        System.out.printf("Dividir entre 4      : %.2f \n", num/=15);
        System.out.printf("Decrementar en 1     : %.2f \n", --num);
        
    }
}
