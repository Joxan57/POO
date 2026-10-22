package p123_Organismo;

public class App {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");

        perro.multicelular();
        perro.sangrecaliente();
        perro.correr();
        perro.cuatroPatas();
        perro.respirar();
        perro.movimiento();
        perro.crecimiento();

        Perico perico = new Perico("Coton");

        perico.multicelular();
        perico.sangrecaliente();
        perico.volar();
        perico.dospatas();
        perico.respirar();
        perico.movimiento();
        perico.crecimiento();

    }
}
