import java.util.Scanner;


public static double pulgadasACentimetros(double pulgadas) {
return pulgadas * 2.54;
}

public static double metrosAPies(double metros) {
return metros * 3.281;
}

void main() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    Scanner obj = new Scanner(System.in);

    System.out.println("Menú:");
    System.out.println("1. Pulgadas a centímetros");
    System.out.println("2. Metros a pies");
    System.out.print("Selecciona opción: ");
    int opcion = obj.nextInt();

    if (opcion == 1) {
            System.out.print("Introduce pulgadas: ");
            double pulgadas = obj.nextDouble();
        System.out.println("Resultado: " + pulgadasACentimetros(pulgadas) + " cm");
    } else if (opcion == 2) {
        System.out.print("Introduce metros: ");
        double metros = obj.nextDouble();
        System.out.println("Resultado: " + metrosAPies(metros) + " pies");
    } else {
        System.out.println("Opción no válida");
    }
}
