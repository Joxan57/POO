import java.util.Scanner;

public class p025_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        System.out.print("Dame un numero entero entre el 1 y 4 y te dire que estacion del año es: ");

        int num = new Scanner(System.in).nextInt();

        if (num >= 1 && num <=4) {

            if( num == 1 )
                System.out.println("Es Primavera : Marzo, Abril, Mayo");
            if( num == 2 ) 
                System.out.println("Es Verano : Junio, Julio, Agosto");
            if( num == 3 ) 
                System.out.println("Es Otoño : Septiembre, Octubre, Noviembre");
            if( num == 4 ) 
                System.out.println("Es Invierno : Diciembre, Octubre, Noviembre");

        } else 
            System.out.println("menso");

    }
}
