import java.util.Scanner;

public class p129_Excepcion5 {
    public static void main(String[] args) {
        int[] datos = {10,20,30,40};
        int pos;

        try{
            System.out.println("Dame la posicion del arreglo");
            Scanner obj = new Scanner(System.in);
            pos = obj.nextInt();
            System.out.println("El valor de la posicion " + pos + " es : " + datos[pos]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: La posicion no existe en el arreglo");

        }finally{
            for(int n : datos){
                System.out.println(n);

            }
        }
    }
}
