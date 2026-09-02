import java.util.Scanner;

public class p054_ArribaAbajo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        System.out.println("imprime los numeros del 1 a n o de n a 1\n");
        System.out.println("Elige la opcion [1] Arriba, [2] Abajo\n"); int op = obj.nextInt();
        int n, m;

        switch (op) {
            case 1:
                
                System.out.println("Imprime los  numeros del 1 al 100");
                System.out.println("hasta donde quieres que llegue: ");  n = obj.nextInt();
                System.out.println("Cual quieres que sea el incremento:  ");  m = obj.nextInt();

                for (int x = 0;  x<=n; x += m){
                    System.out.println(x);
                }
                System.out.println();

            break;
           
            case 2: 

                System.out.println("Imprime los  numeros del n al 1");
                System.out.println("Donde quieres comenzar: ");  n = obj.nextInt();
                System.out.println("Cual quieres que sea el decremeto:\n  "); m = obj.nextInt();

                for (int x = n;  x>=1; x -= m ){
                    System.out.println(x);
                }
                System.out.println();

            break;

            default:
                System.out.println("opcion invalida");
                break;
        }

    }
}
