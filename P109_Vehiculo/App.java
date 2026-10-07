package P109_Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Compacto("C-001", "Toyota", 2022, 18500.00, 5, 4));
        vehiculos.add(new Compacto("C-002", "Honda", 2023, 22000.00, 5, 4));
        vehiculos.add(new Compacto("C-003", "Nissan", 2021, 17250.00, 5, 4));
        vehiculos.add(new Camioneta("CA-001", "Ford", 2022, 38500.00, 1200.0, 2));
        vehiculos.add(new Camioneta("CA-002", "Chevrolet", 2024, 42750.00, 1500.0, 2));

        double totalPrecios = 0;
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Tipo de vehículo: " + vehiculo.getClass().getSimpleName());
            System.out.println(vehiculo);
            System.out.println();
            totalPrecios += vehiculo.getPrecio();
        }

        System.out.printf("Total del precio de todos los vehículos: $%.2f%n", totalPrecios);
    }
}
