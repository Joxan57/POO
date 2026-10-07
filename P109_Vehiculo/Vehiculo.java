package P109_Vehiculo;

public class Vehiculo {
    protected String Serie;
    protected String Marca;
    protected int Appño;
    protected double Precio;
    
    public Vehiculo(String serie, String marca, int appño, double precio) {
        Serie = serie;
        Marca = marca;
        Appño = appño;
        Precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public String getMarca() {
        return Marca;
    }

    public int getAppño() {
        return Appño;
    }

    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", Appño=" + Appño + ", Precio=" + Precio + "]";
    }

    

    

}
