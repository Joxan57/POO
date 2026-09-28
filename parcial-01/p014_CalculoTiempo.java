import java.util.Scanner;

public class p014_CalculoTiempo {
    public static void main(String[] args) {

        float h, d, m, s;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Este programa calcula el equivalente en días, minutos y segundos dada una cantidad de horas.\n");

        System.out.println("Dame la cantidad de horas : "); h = obj.nextFloat();

        d = h / 24;
        m = h * 60;
        s = h * 60 * 60;

        System.err.printf("Dias : %.2f\n", d);
        System.err.printf("minutos : %.2f\n", m);
        System.err.printf("Segundos : %.2f\n", s);
        
        
    }
    
}
