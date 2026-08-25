import java.util.Scanner;

public class p027_AceptarEstudiante {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner obj = new Scanner(System.in);

        System.out.println("Gustambo University SA de CV\n");
        System.out.println("Control de acceso son mayores de 18 y calificacione mayores 8\n");
        
        System.out.println("Dame tu edad : ");

        int edad = obj.nextInt();
        
        if ( edad >=18 ){
            System.out.println("Continuamos por que eres mayor de edad\n ");

            System.out.println("Dame Calificacion 1 : "); float c1 = obj.nextInt();
            System.out.println("Dame Calificacion 2 : "); float c2 = obj.nextInt();

            if (c1 >= 8 && c2 >= 8 ) {
                System.out.println("Eres mayor de edad y tus calificaciones son mayores a 8. Bienvenido!");
            }

            else 
                System.out.println("Calificaciones insuficientes. Rechazado");

        }
        else 
            System.out.println("No aceptamos menores de edad");
        
    }
}
