package p145_ArchivoEstudiante;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String nombre;
    private final int edad;
    private final double promedio;
    private final String sexo;

    public Estudiante(String nombre, int edad, double promedio, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad
                + ", promedio=" + promedio + ", sexo=" + sexo + "]";
    }
}
