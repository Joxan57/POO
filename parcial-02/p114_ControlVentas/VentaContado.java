package p114_ControlVentas;

public class VentaContado extends Venta {
    private double descuento; // Ej. 0.10 para 10%
    private String regalo;

    public VentaContado(String articulo, double cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio); // Llama al constructor padre
        this.descuento = descuento;
        this.regalo = regalo;
    }

    public double getDescuento() { return descuento; }
    public String getRegalo() { return regalo; }

    @Override
    public double getTotalVenta() {
        // Al total base se le resta el descuento
        return total - (total * descuento);
    }

    @Override
    public String toString() {
        return String.format("VentaContado [%s, Descuento= %.2f%%, Regalo= %s, Total= %,.2f]", 
                super.toString(), descuento * 100, regalo, getTotalVenta());
    }
}
