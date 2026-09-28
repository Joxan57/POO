import java.util.Scanner;

public class p036_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int cantidad;
        char tamano;
        float precio = 0, total = 0, descuento = 0, totalPagar;

        Scanner obj = new Scanner(System.in);

        System.out.println("Pizza Planeta");
        System.out.print("Tamaño : [C]hica/[M]ediana/[G]rande ");
        tamano = Character.toUpperCase(obj.next().charAt(0));
        System.out.print("Cantidad: ");
        cantidad = obj.nextInt();

        switch (tamano) {
            case 'C':
                precio = 5;
                break;
            case 'M':
                precio = 10;
                break;
            case 'G':
                precio = 20;
                break;
            default:
                System.out.println("Tamaño no válido");
                break;
        }

        total = precio * cantidad;

        if (total > 2000) {
            descuento = total * 0.15f;
        }

        total = total - descuento;

        System.out.println("Total compra: " + total);
        System.out.println("Descuento (15%): " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}