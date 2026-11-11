package p142_Archivos7;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String nombre;
    private final int edad;
    private final double peso;
    private final String correo;

    public Persona(String nombre, int edad, double peso, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad
                + ", peso=" + peso + ", correo=" + correo + "]";
    }
}
