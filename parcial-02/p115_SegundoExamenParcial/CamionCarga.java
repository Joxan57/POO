package p115_SegundoExamenParcial;

public class CamionCarga extends Vehiculo {
    private int ejes;
    private double kilometraje;

    public CamionCarga(String marca, String modelo, int capacidad, double costoBase, int ejes, double kilometraje) {
        super(marca, modelo, capacidad, costoBase);
        this.ejes = ejes;
        this.kilometraje = kilometraje;
        this.costoTotal = getCostoBase() + getBonoConductor();
    }

    @Override
    public double getBonoConductor() {
        return (getCostoBase() * 0.10) + (ejes * 50) + (kilometraje * 0.5);
    }

    public int getEjes() { return ejes; }
    public double getKilometraje() { return kilometraje; }

    @Override
    public String toString() {
        return String.format("CamionCarga [%s, Ejes=%d, Kilometraje=%.1f, Bono=%.1f, CostoTotal=%.1f]",
                super.toString(), ejes, kilometraje, getBonoConductor(), costoTotal);
    }
}
