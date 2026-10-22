package p123_Organismo;

public class Perro extends Organismo implements Canino {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void multicelular() {
        System.out.println("El " + getNombre() + " es un organismo multicelular");
    }
    
    @Override
    public void sangrecaliente() {
        System.out.println("El " + getNombre() + " es un organismo de sangre caliente");
    }
    
    @Override
    public void correr() {
        System.out.println("El " + getNombre() + " corre");
    }
    
    @Override
    public void cuatroPatas() {
        System.out.println("El " + getNombre() + " tiene 4 patas");
    }
    
}
