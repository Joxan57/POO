import java.util.Scanner;

public class p037_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        float c1, c2, c3, c4, c5, ct; 
        
        System.out.println("Dame la calificacion 1: \n"); c1 = obj.nextFloat(); 
        System.out.println("Dame la calificacion 2: \n"); c2 = obj.nextFloat(); 
        System.out.println("Dame la calificacion 3: \n"); c3 = obj.nextFloat(); 
        System.out.println("Dame la calificacion 4: \n"); c4 = obj.nextFloat(); 
        System.out.println("Dame la calificacion 5: \n"); c5 = obj.nextFloat(); 

        ct = (c1+c2+c3+c4+c5) / 5;

        System.out.printf("Calificacion total : %.2f \n", ct);

        if (ct >= 0 && ct <= 6)
            System.out.println("Quedas Reprobado");
        else if (ct >= 6 && ct <= 7)
            System.out.println("Panzaste");
        else if (ct >= 7 && ct <= 8)
            System.out.println("Bien puedes mejorar");
        else if (ct >= 8 && ct <= 9)
            System.out.println("Buena calificacion");
        else if (ct >= 9 && ct <= 10)
            System.out.println("Promedio excelente!!");
        else 
            System.out.println("Calificacion fuera de Rango");
        
    }
}
