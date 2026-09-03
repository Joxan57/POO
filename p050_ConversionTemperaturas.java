import java.util.Scanner;

public class p050_ConversionTemperaturas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        char op;

        do {
            int inicial;
            int finalTemp;
            
            do {
                System.out.print("Temperatura Inicial: ");
                inicial = obj.nextInt();
                System.out.print("Temperatura Final: ");
                finalTemp = obj.nextInt();
            } while (finalTemp < inicial);
            
            System.out.println("Centigrados\tFahrenheit");
            int ini = inicial;
            
            while (ini <= finalTemp) {
                double fahrenheit = (ini * 9.0 / 5.0) + 32.0;
                System.out.printf("%d\t\t%.1f\n", ini, fahrenheit);
                ini++;
            }
            
            System.out.print("¿Deseas continuar (S/N)? \n");
            op = Character.toUpperCase(obj.next().charAt(0));

        } while (op != 'N');
        System.out.println("camara...");
    }
}