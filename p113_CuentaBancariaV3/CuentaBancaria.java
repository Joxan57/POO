package p113_CuentaBancariaV3;

public abstract class CuentaBancaria {
    private double Saldo;

    public CuentaBancaria(double cantidad){
        if(cantidad < 0) Saldo = 0;
        else Saldo = cantidad;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void actualizarSaldo(double saldo) {
        Saldo = saldo;
    }

    public void depositar(double cantidad){ 
        if(cantidad>0) Saldo += cantidad;
        else throw new IllegalArgumentException("El deposito no puede ser negativo");  
    }

    public abstract boolean retirar(double cantidad);

    @Override
    public String toString() {
    return getClass().getSimpleName()+ ": saldo=" + getSaldo();
    }

    
}
