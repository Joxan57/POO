package p111_CuentaBancariaV1;

public class Cliente {
    private String Nombre;
    private final CuentaBancaria Cuenta;
    
    public Cliente(String nombre, CuentaBancaria cuenta) {
        if(cuenta == null) throw new IllegalArgumentException("Cuenta nula");
        Nombre = nombre;
        Cuenta = cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public CuentaBancaria getCuenta() {
        return Cuenta;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Cuenta=" + Cuenta + "]";
    }
    
    
    
    
}
