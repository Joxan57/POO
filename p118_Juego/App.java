package p118_Juego;

public class App {
    public static void main(String[] args) {
        System.out.println("\nJuego de adivinar número ...");
        JuegoAdivina juego2 = new JuegoAdivina();
        juego2.iniciar();
        juego2.Jugar();
        juego2.Finalizar();

        Juego juego = new JuegoDados();
        System.out.println("Bienvenido al juego de dados");

        juego.iniciar();
        juego.Jugar();
        juego.Finalizar();
    }
}
