package p118_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego{
    private int numazar, resusuario, intentos;
    private Scanner teclado;

    public JuegoAdivina() {
        teclado = new Scanner(System.in);

    }
    
    @Override
    public void iniciar() {
        numazar = (int) (Math.random() * 100) + 1;
        
    }

    
    @Override
    public void Jugar() {
        do {
            System.out.print("Adivina número entre 1 y 100: "); resusuario = teclado.nextInt();
            if(this.resusuario<resusuario) System.out.println("El número a adivinar es menor");
            else if(this.resusuario>resusuario) System.out.println("El número a adivimar es mayor");
            intentos++;
            } while(this.numazar != resusuario);
        
    }
    
    @Override
    public void Finalizar() {
        System.out.println(this.numazar + " era el número !!!, ganaste el juego despues de " + intentos + " intentos");
        
    }
    
    
}
