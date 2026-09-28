import java.util.Scanner;

public class p026_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.println("Dame un angulo entre 0 y 360 para decirte su tipo");

        int ang = new Scanner(System.in).nextInt();

        if ( ang >= 0 && ang <= 360 ){

            System.out.println("El angulo que me diste es : ");

            if ( ang < 90 )
                System.out.println("Agudo");
            if ( ang == 90 )
                System.out.println("Recto");
            if ( ang > 90 && ang < 180 )
                System.out.println("Obtuso");
            if ( ang == 180 )
                System.out.println("Llano");
            if ( ang > 180  )
                System.out.println("Concavo");

        }

        else 
            System.out.println("No existe clasificacion para ese angulo");
    }
}
