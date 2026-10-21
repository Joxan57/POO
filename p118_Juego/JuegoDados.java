package p118_Juego;

import java.util.Scanner;

public class JuegoDados implements Juego {
    
    private int dado1, dado2;
    private String j1, j2;

    private Scanner teclado;
    public JuegoDados(){
        teclado = new Scanner(System.in);
    }
   
    @Override
    public void iniciar() {
        System.out.println("Ingresa el nombre del J1"); j1 = teclado.nextLine();
        System.out.println("Ingresa el nombre del J2"); j2 = teclado.nextLine();
        
    }
    @Override
    public void Jugar() {
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        System.out.println(j1 + "saco un : " + dado1);
        System.out.println(j2 + "saco un : " + dado2);


        
    }
    @Override
    public void Finalizar() {
        if(dado1 > dado2) System.out.println("Gano "+j1+" con un valor de "+dado1);
        else if(dado2>dado1) System.out.println("Gano "+j2+" con un valor de "+dado2);
        else System.out.println("Empataron los jugadores con el valor de "+dado1);
            
    }

    
}
