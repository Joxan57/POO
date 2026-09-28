import java.util.Scanner;

public long factorial(int numero ){
    int fac = 1;
    for(int i=i; i <= numero; i++)
        fac *= i;
    return fac;

}
void main() {
    System.out.println("Que numero? : ");
    int fac = new Scanner(System.in).nextInt();
    System.out.printf("%,d",factorial(fac));

}