package p123_Organismo;

public class Organismo {
    private String Nombre;

    public Organismo(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void respirar(){
        System.out.println("El organismo " + Nombre + " respira");
    }
      
    public void movimiento(){
        System.out.println("El organismo " + Nombre + " se mueve");
    }  

    public void crecimiento(){
        System.out.println("El organismo " + Nombre + " crece");
    }  
}
