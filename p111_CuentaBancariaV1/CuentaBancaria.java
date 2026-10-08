package p111_CuentaBancariaV1;

public class CuentaBancaria {
    private double Saldo;

    public CuentaBancaria(double cantidad) {
        if (cantidad > 0) Saldo = cantidad;
        else throw new IllegalArgumentException("Cantidad negativa");
    }

    public double getSaldo() {
        return Saldo;
    }

    public void deposita(double cantidad) {
        if (cantidad > 0)
            Saldo += cantidad;
        else
        throw new IllegalArgumentException("cantidad Negativa");
    }

    public boolean retira(double cantidad) {
        if (cantidad > 0 && Saldo >= cantidad) {
            Saldo -= cantidad;
            return true;
        }
        throw new IllegalArgumentException("No se pudo");
    }

}
