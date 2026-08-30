import java.util.Scanner;

public class p041_ProcesaCalificaciones {
    public static void main(String[] args) {

        int n, c;
        float calif, tc, prom;
        Scanner obj = new Scanner(System.in);
        calif = tc = prom = 0;
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Procesa n calificaciones, calcula la suma y el promedio");
        System.out.print("Cuantas calificaciones ? ");
        n = obj.nextInt();
        c = 1;

        while (c <= n) {
            System.out.printf("Calificacion %d? ", c++);
            calif = obj.nextFloat();
            tc = tc + calif;
        }
        prom = tc / n;

        System.out.printf("La suma es : %.2f\n", tc);
        System.out.printf("El promedio es : %.2f\n", prom);
    }
}