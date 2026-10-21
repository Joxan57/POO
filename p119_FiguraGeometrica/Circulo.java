package p119_FiguraGeometrica;

public class Circulo implements FiguraGeometrica, Ajustable {
    private double radio;

    public Circulo(double radio) {
        validarDimension(radio, "radio");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void ajustar(double porcentaje) {
        validarDimension(porcentaje, "porcentaje");
        radio *= porcentaje / 100;
    }

    private static void validarDimension(double valor, String nombre) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("El " + nombre + " debe ser un número positivo y finito.");
        }
    }
}
