package p107_Persona;

public class Estudiante extends Persona {
    private String carrera;
    private int anio;
    private double colegiatura;

    public Estudiante() {
    }

    public Estudiante(Persona persona, String carrera, int anio, double colegiatura) {
        super(persona.getNombre(), persona.getDireccion());
        this.carrera = carrera;
        this.anio = anio;
        this.colegiatura = colegiatura;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(double colegiatura) {
        this.colegiatura = colegiatura;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", direccion=" + direccion + ", carrera=" + carrera
                + ", anio=" + anio + ", colegiatura=" + colegiatura + "]";
    }
}
