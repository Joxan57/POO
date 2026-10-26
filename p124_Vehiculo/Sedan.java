package p124_Vehiculo;

public class Sedan extends Maquina implements Familiar{

    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void encender() {
        System.out.println("El vehiculo " + getNombre() + " se esta encendiendo");
    }

    @Override
    public void desplazarse() {
        System.out.println("El vehiculo " + getNombre() + " se esta desplazando");
    }

    @Override
    public void carroceriaTres() {
        System.out.println("El vehiculo " + getNombre() + " tiene carroceria de tres cuerpos");
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("El vehiculo " + getNombre() + " tiene chasis monocasco");
    }
}
