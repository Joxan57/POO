package p114_ControlVentas;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String propietario;
    private String domicilio;
    private List<Cliente> clientes;

    public Tienda(String nombre, String propietario, String domicilio) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.domicilio = domicilio;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public double getTotal() {
        double totalTienda = 0;
        for (Cliente c : clientes) {
            totalTienda += c.getTotal();
        }
        return totalTienda;
    }

    public void reporte() {
        System.out.println("Reporte de ventas de los clientes : " + this.toString());
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            for (Venta venta : cliente.getVentas()) {
                System.out.println(venta);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return String.format("Tienda [Propietario= %s, Domicilio= %s, Clientes= %d, Total = %,.2f]",
                propietario, domicilio, clientes.size(), getTotal());
    }
}