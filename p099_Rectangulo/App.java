package p099_Rectangulo;

public class App {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(1.2f, 3.4f);
        Rectangulo rectangulo2 = new Rectangulo();
        Rectangulo rectangulo3 = new Rectangulo(5.6f, 7.8f);

        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        System.out.println(rectangulo3);
        System.out.println("Longitud : " + rectangulo3.getLargo());
        System.out.println("Ancho " + rectangulo3.getAncho());
        System.out.printf("El area es : %.2f%n", rectangulo3.getArea());
        System.out.printf("El perimetro es : %.2f%n", rectangulo3.getPerimetro());
    }
}
