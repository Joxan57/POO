package p115_SegundoExamenParcial;

public class AutobusPasajeros extends Vehiculo {
    private int rutas;
    private int pasajerosTransportados;

    public AutobusPasajeros(String marca, String modelo, int capacidad, double costoBase, int rutas, int pasajerosTransportados) {
        super(marca, modelo, capacidad, costoBase);
        this.rutas = rutas;
        this.pasajerosTransportados = pasajerosTransportados;
        this.costoTotal = getCostoBase() + getBonoConductor();
    }

    @Override
    public double getBonoConductor() {
        return (getCostoBase() * 0.15) + (rutas * 120) + (pasajerosTransportados * 0.1);
    }

    public int getRutas() { return rutas; }
    public int getPasajerosTransportados() { return pasajerosTransportados; }

    @Override
    public String toString() {
        return String.format("AutobusPasajeros [%s, Rutas=%d, PasajerosTransportados=%d, Bono=%.1f, CostoTotal=%.1f]",
                super.toString(), rutas, pasajerosTransportados, getBonoConductor(), costoTotal);
    }
}