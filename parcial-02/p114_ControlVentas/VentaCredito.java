package p114_ControlVentas;

public class VentaCredito extends Venta {
    private double meses;
    private double interes; // Ej. 0.10 para 10%

    public VentaCredito(String articulo, double cantidad, double precio, double meses, double interes) {
        super(articulo, cantidad, precio);
        this.meses = meses;
        this.interes = interes;
    }

    public double getMeses() { return meses; }
    public double getInteres() { return interes; }

    @Override
    public double getTotalVenta() {
        // Al total base se le agrega: Meses * Interés
        return total + (total * meses * interes);
    }

    @Override
    public String toString() {
        return String.format("VentaCredito [%s, Meses= %.1f, Interes= %.2f%%, TotalVenta= %,.2f]", 
                super.toString(), meses, interes * 100, getTotalVenta());
    }
}