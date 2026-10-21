package p116_Animal;

public class App {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.sonido();
        gato.dormir();
        gato.sonido();

        Animal animal = new Gato();
        animal.sonido();
        animal.dormir();

    }
}
