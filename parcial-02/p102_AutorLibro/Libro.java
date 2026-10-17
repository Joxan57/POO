package p102_AutorLibro;

public class Libro {
    private String Isbn;
    private String Nombre;
    private Autor Autor;
    private Double Precio;
    private int Cant;
    
    public Libro() {
    }

    public Libro(String isbn, String nombre, p102_AutorLibro.Autor autor, Double precio, int cant) {
        Isbn = isbn;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
        Cant = cant;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor autor) {
        Autor = autor;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getCant() {
        return Cant;
    }

    public void setCant(int cant) {
        Cant = cant;
    }

    @Override
    public String toString() {
        return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Precio=" + Precio + ", Cant="
                + Cant + "]";
    }
}
