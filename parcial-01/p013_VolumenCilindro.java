import java.util.Scanner;

public class p013_VolumenCilindro {
    public static void main(String[] args) {
        
        float radio, altura, volumen;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Este programa calcula el volumen de un cilindro dados su radio y altura.\n");

        System.out.println("Dame el radio del cilindro   :"); radio = obj.nextFloat();
        System.out.println("Dame la altura del cilindro  :"); altura = obj.nextFloat();

        volumen = (float) (Math.PI * (radio * radio) * altura);

        System.out.printf("Volumen  : %.2f", volumen);

    }
    
}
