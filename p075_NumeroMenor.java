import java.util.Scanner;

public int menor(int n1, int n2, int n3, int n4) {
    int menor = 0;
    if(n1 < n2 && n1 < n3 && n1 < n4)
        menor = n1;
    else if(n2 < n1 && n2 < n3 && n2 < n4)
        menor = n2;
    else if(n3 < n2 && n3 < n1 && n3 < n4)
        menor = n3;
    else if(n4 < n2 && n4 < n3 && n4 < n1)
        menor = n4;
    else 
        System.out.println("error");

    return menor;
    
}


void main(){

    System.out.print("\033[H\033[2J");
    System.out.flush();
    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el numero 1 : ");
    int n1 = obj.nextInt();
    System.out.println("Dame el numero 2 : ");
    int n2 = obj.nextInt();
    System.out.println("Dame el numero 3 : ");
    int n3 = obj.nextInt();
    System.out.println("Dame el numero 4 : ");
    int n4 = obj.nextInt();

    System.out.println("El menor es : " + menor(n1, n2, n3, n4));
        
}