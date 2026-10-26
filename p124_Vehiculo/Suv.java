package p124_Vehiculo;

public class Suv extends Maquina implements TodoTerreno{

	public Suv(String nombre, String propietario, int pasajeros) {
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
	public void traccion4x4() {
		System.out.println("El vehiculo " + getNombre() + " tiene traccion 4x4");
	}

	@Override
	public void chasisIndependiente() {
		System.out.println("El vehiculo " + getNombre() + " tiene chasis independiente");
	}
}
	
