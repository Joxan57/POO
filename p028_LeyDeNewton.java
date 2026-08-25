import java.util.Scanner;

public class p028_LeyDeNewton {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Calculando la segunda ley de Newton ");
        System.out.println("[ 1 ] Calcular la fuerza f = m * a");
        System.out.println("[ 2 ] Calcular la masa ");
        System.out.println("[ 3 ] Calcular la aceleracion ");
        float m, f, a; 
        
        System.out.println("Dame el numero de Opcion : ");int op = obj.nextInt();

        if (op == 1) {
            System.out.println("\nCalculando la Fuerza ...");
            System.out.print("Masa ? ");
            m = obj.nextFloat();
            System.out.print("Aceleracion ? ");
            a = obj.nextFloat();
            f = m * a;
            System.out.printf("\nFuerza: %.2f", f);
            } 
        else if (op == 2) {
            System.out.println("\nCalculando la Masa ...");
            System.out.print("Fuerza ? ");
            f = obj.nextFloat();
            System.out.print("Aceleracion ? ");
            a = obj.nextFloat();
            m = f / a;
            System.out.printf("\nMasa: %.2f", m);
            } 
        else if (op == 3) {
            System.out.println("\nCalculando la Aceleracion ...");
            System.out.print("Fuerza ? ");
            f = obj.nextFloat();
            System.out.print("Masa ? ");
            m = obj.nextFloat();
            a = f / m;
            System.out.printf("\nAceleración: %.2f", a);
            } 
        else
            System.out.println("\nOpcion Invalida \n");

    }
    
}
