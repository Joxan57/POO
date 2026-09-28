import java.util.Scanner;

public class p004_PagaTrabajador {
    public static void main(String[] args) {
        
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        
        Scanner obj = new Scanner(System.in);

        //Entrada Datos
        System.out.println("\nNombre:"); 
        nombre = obj.nextLine();
        System.out.println("\nHoras:"); 
        horas = obj.nextInt();
        System.out.println("\nPaga por hora:"); 
        paga = obj.nextFloat();
        tasa = 0.03;

        //Calculos
        pagabruta = horas * paga;
        impuesto = paga * tasa;
        paganeta= pagabruta - impuesto; 

        //salida
        System.out.println("\nResumen de Pagos:\n");
        System.out.println( String.format("El trabajador %s trabajo %d horas, a una paga de %f pesos la hora,tasa de impuesto %.2f", nombre, horas, paga, tasa));
        System.out.println( String.format("Paga Bruta: %.2f", pagabruta));
        System.out.println( String.format("Impuestos: %.2f", impuesto));
        System.out.println( String.format("Paga Neta: %.2f", paganeta));
        

    }
    
}
