package p124_Vehiculo;

public class Maquina {
    private String Nombre;
    private String Propietario;
    private int Pasajeros;
    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }

    public String getNombre() {
        return Nombre;
    }

    public void repostar(){
        System.out.println(Nombre + " esta repostando combustible");
    }

    public void arrancar(){
        System.out.println(Nombre + " esta arrancando");
    }

    public void frenar(){
        System.out.println(Nombre + " esta frenando");
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }
    
    

}
