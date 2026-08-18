import java.util.Scanner;

public class p012_ConvertirTemperatura {
    public static void main(String[] args) {
        
        float gfare, gcel;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Este programa convierte una temperatura de Fahrenheit a Celsius\n");
        System.out.println("Dame los grados Fahrenheit : \n"); gfare = obj.nextFloat();

        gcel = (gfare - 32) * 5 / 9;

        System.out.printf("Los grados Celcius son:  %.2f", gcel);
        

    }
}
