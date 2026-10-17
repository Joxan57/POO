package p115_SegundoExamenParcial;

import java.util.ArrayList;

public class Flota {
    private String nombre;
    private String ciudad;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Vehiculo vehiculo : vehiculos) {
            totalBono += vehiculo.getBonoConductor();
        }
        return totalBono;
    }

    public double getTotalCosto() {
        double totalCosto = 0;
        for (Vehiculo vehiculo : vehiculos) {
            totalCosto += vehiculo.getCostoTotal();
        }
        return totalCosto;
    }

    public int getNumCamiones() {
        int cantidad = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof CamionCarga) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int getNumAutobuses() {
        int cantidad = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof AutobusPasajeros) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void reporte() {
        System.out.println(">> Reporte Detallado de la Flota <<<<<");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Flota [Nombre División %s, Ciudad %s, Vehículos = %d, BonoTotal = %.1f, CostoTotal = %.1f, Camiones = %d, Autobuses = %d]",
                nombre, ciudad, vehiculos.size(), getTotalBono(), getTotalCosto(), getNumCamiones(), getNumAutobuses()
        );
    }
}
