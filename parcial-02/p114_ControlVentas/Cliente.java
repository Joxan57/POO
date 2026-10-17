package p114_ControlVentas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String domicilio;
    private String correo;
    private List<Venta> ventas; // Composición: Lista de ventas del cliente

    public Cliente(String nombre, String domicilio, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public double getTotal() {
        double totalCliente = 0;
        for (Venta v : ventas) {
            totalCliente += v.getTotalVenta(); // Uso de polimorfismo
        }
        return totalCliente;
    }

    @Override
    public String toString() {
        return String.format(">> Cliente [ Nombre= %s, Domicilio= %s, Correo= %s, Ventas= %d, Total=%,.2f ]",
                nombre, domicilio, correo, ventas.size(), getTotal());
    }
}