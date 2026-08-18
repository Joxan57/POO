import java.util.Scanner;

public class p015_ConvertirADolares {
    public static void main(String[] args) {
        
        float pesos, dolares, equivalente;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Este programa convierte una cantidad de pesos a dólares según una cotización dada.\n");

        System.out.println("Dame la cantidad en pesos : "); pesos = obj.nextFloat();
        System.out.println("Dame la cotizacion del dolar : "); dolares = obj.nextFloat();
    
        equivalente = pesos / dolares;

        System.out.printf("Equivalente en dólares:  %.2f", equivalente);
    }
    
}
