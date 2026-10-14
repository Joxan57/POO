package p113_CuentaBancariaV3;

public class CuentaDeCheques extends CuentaBancaria {
    private double LimiteSobregiro;

    public CuentaDeCheques(double cantidad, double limite) {
        super(cantidad);
        if(limite>=0)LimiteSobregiro=limite;
        else LimiteSobregiro=0;
    }

    public double getLimiteSobregiro() {
        return LimiteSobregiro;
    }

    public double getDisponible(){return getSaldo() + getLimiteSobregiro();}

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad>0 && cantidad <= getDisponible()){
            actualizarSaldo(getSaldo()-cantidad);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaDeCheques [LimiteSobregiro=" + LimiteSobregiro + "]";
    }    

    
    
    
    
}
