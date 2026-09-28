import java.util.Scanner;

public class p035_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner obj = new Scanner(System.in);
        System.out.println("Dado un numero del 1 al 6 te dire el continente");
        System.out.print("Ingresa número de continente: ");
        int continente = obj.nextInt();

        System.out.print("Resultado: ");
        switch (continente) {
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("África");
                break;
            case 3:
                System.out.println("América del Norte");
                break;
            case 4:
                System.out.println("América del Sur");
                break;
            case 5:
                System.out.println("Antártida");
                break;
            case 6:
                System.out.println("Europa");
                break;
            default:
                System.out.println("Error, menso");
                break;
        }

    }
}