import java.util.Scanner;

public int numerosuerte(int ano) {
    
    int digito = 0, suma = 0;
    
    while( ano != 0 ) {
        digito = ano % 10;
        System.out.println(digito);
        suma = suma + digito;
        ano = ano / 10;
    }
    return suma;
}
void main() {

    int ano = 0, numerosuerte=0;
    Scanner obj = new Scanner(System.in);
    System.out.print("\033[H\033[2J");
    System.out.println("Dame tu ano de nacimiento : ");
    ano = obj.nextInt();
    numerosuerte = numerosuerte(ano);
    System.out.println("Tu numero de la suerte es : " + numerosuerte);
}