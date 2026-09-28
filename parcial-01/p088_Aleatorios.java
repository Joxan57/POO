import java.util.Random;

void main(){
    Random rnd = new Random();
     
    int aleatorio1 = Math.abs(rnd.nextInt());
    int aleatorio2 = Math.abs(rnd.nextInt(30));
    int aleatorio3 = Math.abs(rnd.nextInt(100-50))+50;

    System.out.print("\033[H\033[2J\033[3J");

    System.out.printf("Numero aleatorio entero positivo : %d", aleatorio1);
    System.out.printf("\nNumero aleatorio entero positivo : %d", aleatorio2);
    System.out.printf("\nNumero aleatorio entero positivo : %d", aleatorio3);

}