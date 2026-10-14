package p113_CuentaBancariaV3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Cliente {
    private String Nombre;
    private final List<CuentaBancaria> Cuentas;

    public Cliente() {
        Cuentas = new ArrayList<>();
    }

    public Cliente(String nombre) {
        this();
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        if (cuenta != null)
            Cuentas.add(cuenta);
    }

    public List<CuentaBancaria> getCuentas() {
        return Collections.unmodifiableList(Cuentas);
    }

    public double getTotal() {
        double total = 0;
        for (CuentaBancaria cuenta : Cuentas)
            total += cuenta.getSaldo();
        return total;
    }

    @Override
    public String toString() {
        return Nombre + ": cuentas=" + Cuentas.size()
                + ", total=" + getTotal();
    }

}
