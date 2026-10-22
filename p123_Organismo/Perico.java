package p123_Organismo;

public class Perico extends Organismo implements Ave {

    public Perico(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
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
    public void volar() {
        System.out.println("El " + getNombre() + " puede volar");
    }
    
    @Override
    public void dospatas() {
        System.out.println("El " + getNombre() + " tiene 2 patas");
    }
    
    
}
