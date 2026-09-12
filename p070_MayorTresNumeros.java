import java.util.Scanner;

public class p070_MayorTresNumeros {
    public int mayor(float n1, float n2, float n3) {
        
        int mayor=0;

        if( n1 > n2 && n1 > n3 ) 
            mayor = n1;
        else if( n2 > n1 && n2 > n3 )
            mayor = n2;
        else if( n3 > n1 && n3 > n2 );
            mayor = n3;

        return mayor;
    }   
    void main() {
        float n1, n2, n3 mayor=0;
        p070_MayorTresNumeros programa = new p070_MayorTresNumeros();
        System.out.println(programa.mayor(10, 15, 9));
    }
}
