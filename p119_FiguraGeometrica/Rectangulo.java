package p119_FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica, Ajustable {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        validarDimension(largo, "largo");
        validarDimension(ancho, "ancho");
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public double getArea() {
        return largo * ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public void ajustar(double porcentaje) {
        validarDimension(porcentaje, "porcentaje");
        double factor = porcentaje / 100;
        largo *= factor;
        ancho *= factor;
    }

    private static void validarDimension(double valor, String nombre) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("El " + nombre + " debe ser un número positivo y finito.");
        }
    }
}
