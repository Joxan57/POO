package p109_Vehiculo;

public class Camioneta extends Vehiculo{
    private double Capacidad;
    private int Ejes;
    
    public Camioneta(String serie, String marca, int appño, double precio, double capacidad, int ejes) {
        super(serie, marca, appño, precio);
        Capacidad = capacidad;
        Ejes = ejes;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public int getEjes() {
        return Ejes;
    }

    @Override
    public String toString() {
        return "Camioneta [Serie=" + Serie + ", Capacidad=" + Capacidad + ", Marca=" + Marca + ", Ejes=" + Ejes
                + ", Appño=" + Appño + ", Precio=" + Precio + "]";
    }

    
    
    
}
