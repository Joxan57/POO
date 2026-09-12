import java.util.Scanner;

public class p074_CuadroCaracter {
    public static void Cuadro(int r, int c, char car) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++)
                System.out.printf("%c ", car);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r, c;
        char car;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Renglones ? ");
        r = obj.nextInt();
        System.out.print("Columnas ? ");
        c = obj.nextInt();
        System.out.print("Caracter ? ");
        car = Character.toUpperCase(obj.next().charAt(0));
        Cuadro(r, c, car);
    }
}