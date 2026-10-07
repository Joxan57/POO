package P109_Vehiculo;

public class Compacto extends Vehiculo{
    private int Pasajeros;
    private int Puertas;


    public Compacto(String serie, String marca, int appño, double precio, int pasajeros, int puertas) {
        super(serie, marca, appño, precio);
        Pasajeros = pasajeros;
        Puertas = puertas;
    }
    public int getPasajeros() {
        return Pasajeros;
    }
    public int getPuertas() {
        return Puertas;
    }
    @Override
    public String toString() {
        return "Compacto [Serie=" + Serie + ", Marca=" + Marca + ", Appño=" + Appño + ", Precio=" + Precio
                + ", Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }

    
   
    
    
    
    }

    
