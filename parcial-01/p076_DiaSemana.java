import java.util.Scanner;

public static String DiaSemana(int dia) {
    switch (dia) {
        case 1: return "Lunes";
        case 2: return "Martes";
        case 3: return "Miércoles";
        case 4: return "Jueves";
        case 5: return "Viernes";
        case 6: return "Sábado";
        case 7: return "Domingo";
        default: return "Error: Número fuera de rango (debe ser de 1 a 7)";
    }
}

public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    Scanner obj = new Scanner(System.in);

    System.out.print("Introduce un número (1-7): ");
    int dia = obj.nextInt();
    System.out.println("Día: " + DiaSemana(dia));
}
