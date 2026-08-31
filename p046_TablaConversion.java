import java.util.Scanner;

public class p046_TablaConversion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        float tc = 17.03f;
        float ini, fin;
        char r;

        System.out.println("Conversion de precio a dolar, tipo de cambio:\n"+tc);
        System.out.println("Dame el inicio"); ini = obj.nextFloat();
        System.out.println("Dame el Final"); fin = obj.nextFloat();
        

        float c = ini;

        do{
            if (ini>fin){System.out.println("ne mame"); break;}
            while (c <= fin) {
                System.err.printf("%,10.2f = %,5.2f\n", c, c/tc);
                c++;
            }

            System.out.println("Deseas continuar (S/N)?\n"); r = Character.toUpperCase(obj.next().charAt(0));

        } while(r != 'N');


    }
}
