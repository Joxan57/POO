import java.util.Scanner;

public int sumapi(int ini, int fin, char pi){
    int suma = 0; 
    for(int i=ini; i<=fin; i++){
        if(pi=='P' && i%2==0) {
            suma += i;
            System.out.println(i);
        else if(pi=='I' $$)
        }
    }

    return suma;

}

void main(){
    Scanner obj = new Scanner(System.in);
    System.out.print("\033[H\033[2J");
    System.out.println("Dame el inicio del rango : "); ini = obj.nextInt();
    System.out.println("Dame el inicio del rango : "); fin = obj.nextInt();
    System.out.println("[P]ares o [I]mpares : "); Character.toUpperCase(obj.next().charAt(0) );
    
    System.out.println("La suma es de : " + sumapi(ini,fin,'I'));
    

}
