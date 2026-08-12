import java.util.Scanner;

public class p002_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando area circulo\n");
        System.out.println("Dame el radio del circulo: ");
        radio = lradio.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        System.out.println("\nEl area de tu circulo es: \n" + area);
    }
}
    