import java.util.Scanner;

public class p006_PromedioCalificaciones {
    public static void main(String[] args) {
        
        float c1, c2, c3;
        
        Scanner obj = new Scanner(System.in);

        System.out.println("\033[H\033[2J");
        
        System.out.println("Calculando el promedio de 3 calificaciones \n");

        System.out.println("Dame la calificacion 1 : \n"); c1 = obj.nextFloat();
        System.out.println("Dame la calificacion 2 : \n"); c2 = obj.nextFloat();
        System.out.println("Dame la calificacion 3 : \n"); c3 = obj.nextFloat();

        float suma = c1 + c2 + c3;
        float prom = suma / 3;
        float mayor = Math.max( Math.max(c1, c2) , c3 );
        float menor = Math.min( Math.min(c1, c2) , c3 );
        
        System.out.printf("Las calificaciones son : %.2f, %.2f, %.2f \n", c1, c2, c3);
        System.out.printf("La suma de las calificaciones es : %.2f \n", suma);
        System.out.printf("El promedio final es : %.2f \n", prom);
        System.out.printf("La mayor  es : %.2f \n", mayor);
        System.out.printf("La menor es : %.2f \n", menor);

        obj.close();

    }
}
