import java.util.Scanner;

public class p011_CalcularAngulo {

    public static void main(String[] args) {
        
        float angulo1, angulo2, angulo3;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Este programa calcula el tercer ángulo de un triángulo dados los dos primeros.");
        System.out.println("Dame el angulo 1: "); angulo1 = obj.nextFloat();
        System.out.println("Dame el angulo 2: "); angulo2 = obj.nextFloat();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.printf("El valor del angulo 3 es : %.2f", angulo3);
    }
}