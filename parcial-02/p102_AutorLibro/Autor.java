package p102_AutorLibro;

public class Autor {
    private String Nombre;
    private String Correo;

    public Autor() {
    }

    public Autor(String Nombre, String Correo) {
        this.Nombre = Nombre;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Autor{Nombre='" + Nombre + "', Correo='" + Correo + "'}";
    }
}
