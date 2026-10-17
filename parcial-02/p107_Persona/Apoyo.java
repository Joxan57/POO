package p107_Persona;

public class Apoyo extends Persona {
    private String escolaridad;
    private double paga;

    public Apoyo() {
    }

    public Apoyo(Persona persona, String escolaridad, double paga) {
        super(persona.getNombre(), persona.getDireccion());
        this.escolaridad = escolaridad;
        this.paga = paga;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public double getPaga() {
        return paga;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return "Apoyo [nombre=" + nombre + ", direccion=" + direccion + ", escolaridad=" + escolaridad
                + ", paga=" + paga + "]";
    }
}
