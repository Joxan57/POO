import java.util.Scanner;

public class p044_ParesAscendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        int i, f, suma=0;
        char r;

        System.out.println("Imprime numeros pares desde 2 hasta n\n");
        System.out.println("hasta donde: \n"); f = obj.nextInt();

        i = 2;

        do{

            while (i<=f){
                System.out.printf("%d\n", i);
                suma += i;
                i +=2;
            } 
            System.out.printf("La suma  es %,d\n", suma);
            System.out.println("Deseas continuar (S/N)? ");
            r = Character.toUpperCase(obj.next().charAt(0));
        } while (r != 'N');
        System.out.println("proceso terminado");


        
    }
}
