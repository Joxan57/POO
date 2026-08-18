import java.util.Scanner;

public class p010_HipotenusaTriangulo {

    public static void main(String[] args) {
        
        float hipo, lado1, lado2;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Este programa calcula la hipotenusa de un triángulo rectángulo dados sus dos lados.");

        System.out.println("Dame el valor del lado 1:  \n"); lado1 = obj.nextFloat();
        System.out.println("Dame el valor del lado 2:  \n"); lado2 = obj.nextFloat();

        hipo = (float) Math.sqrt(lado1 * lado1 + lado2 * lado2);

        System.out.printf("La hipotenusa del triangulo es:  %.2f", hipo);


    }
}