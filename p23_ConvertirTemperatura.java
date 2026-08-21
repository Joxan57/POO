import java.util.Scanner;

public class p23_ConvertirTemperatura {
    public static void main(String[] args) {

        int op;
        float temp, res;

        Scanner obj = new Scanner(System.in);
        
        System.out.println("\033[H\033[2J");

        System.out.println("Convertir temperaturas\n");
        System.out.println("[1] Celcius a arenheit");
        System.out.println("[2] Farenheit a celcius");
        
        System.out.println("Dame una opcion : "); op = obj.nextInt();

        if (op == 1){
            System.out.println("Convirtiendo de Celcius a Farenheit\n");
            System.out.println("Dame la temmperatura en celcius : "); temp = obj.nextFloat();
            
            res = (temp * 9 / 5) + 32;

            System.out.printf("La temperatura en Farenheit es igual a : %.2f", res);
        }
        
        else{
        System.out.println("Convirtiendo de Farenheit a Celcius\n");
        System.out.println("Dame la temmperatura en Farenheit: "); temp = obj.nextFloat();
        
        res = (temp - 32) * 5 / 9;
            
            System.out.printf("La temperatura en Celcius es igual a : %.2f", res);
        }

        }
}
