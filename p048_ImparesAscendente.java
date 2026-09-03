import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        char op;

        System.out.println("imprime los numeros impares del 1 hasta n");
        do {
            System.out.println("Dame hasta que numero quieres llegar : ");
            int n = obj.nextInt();
            int ini = 1, suma = 0, contador = 0;
            
            while (ini <= n){
                System.out.print(ini + " ");
                suma += ini;
                ini +=2;
                contador++;}

            System.out.printf("\nLa suma es de : %d\n", suma);
            System.out.printf("El promedio es de : %d\n", suma / contador);
            
            System.out.print("¿Deseas continuar (S/N)? \n");
            op = Character.toUpperCase(obj.next().charAt(0));

        } while (op != 'N');
        System.out.println("camara...");
    }
}
