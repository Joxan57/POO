import java.util.Scanner;

public class p059_FactorialNumeros {
    public static void main(String[] args) {
        int  f;
        System.out.println("dame un numero: ");
        int n = new Scanner(System.in).nextInt();

        f = 1;

        for (int i=1; i<=n; i++){
            System.out.printf("%d %c ",i, i==n ? ' ' : 'x'  );
            
            f=f*i;
        }
        System.out.printf("= %d \n", f);
    }
}
