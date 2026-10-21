package p119_FiguraGeometrica;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Ejemplo de círculo");
        System.out.printf("Radio: %.2f%n", circulo.getRadio());
        System.out.printf("Área: %.2f%n", circulo.getArea());
        System.out.printf("Perímetro: %.2f%n", circulo.getPerimetro());

        circulo.ajustar(150);
        System.out.println("Después de aumentar el tamaño al 150%:");
        System.out.printf("Radio: %.2f%n", circulo.getRadio());
        System.out.printf("Área: %.2f%n", circulo.getArea());
        System.out.printf("Perímetro: %.2f%n%n", circulo.getPerimetro());

        Rectangulo rectangulo = new Rectangulo(8, 4);
        System.out.println("Ejemplo de rectángulo");
        System.out.printf("Largo: %.2f, ancho: %.2f%n", rectangulo.getLargo(), rectangulo.getAncho());
        System.out.printf("Área: %.2f%n", rectangulo.getArea());
        System.out.printf("Perímetro: %.2f%n", rectangulo.getPerimetro());

        rectangulo.ajustar(50);
        System.out.println("Después de reducir el tamaño al 50%:");
        System.out.printf("Largo: %.2f, ancho: %.2f%n", rectangulo.getLargo(), rectangulo.getAncho());
        System.out.printf("Área: %.2f%n", rectangulo.getArea());
        System.out.printf("Perímetro: %.2f%n", rectangulo.getPerimetro());
    }
}
