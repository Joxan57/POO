package p115_SegundoExamenParcial;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int capacidad;
    private double costoBase;
    protected double costoTotal;

    public Vehiculo(String marca, String modelo, int capacidad, double costoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.costoBase = costoBase;
    }

    public abstract double getBonoConductor();

    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }
    public double getCostoBase() { return costoBase; }
    public double getCostoTotal() { return costoTotal; }

    @Override
    public String toString() {
        return String.format("Vehiculo [Marca=%s, Modelo=%s, Capacidad=%d, CostoBase=%.2f]",
                marca, modelo, capacidad, costoBase);
    }
}

