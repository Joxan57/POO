package p104_PuntoCirculo;

public class App {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 8);
        Punto p2 = new Punto(30, 46);

        Circulo c1 = new Circulo(p1, 6);
        Circulo c2 = new Circulo(p2, 2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.printf("%-32s: %s%n", "Circulo 1 Area", c1.getArea());
        System.out.printf("%-32s: %s%n", "Circulo 1 Circunferencia", c1.getCircunferencia());
        System.out.printf("%-32s: %s%n", "Circulo 1 Centro", c1.getCentro());
        System.out.printf("%-32s: %s%n", "Distancia a Circulo 2", c1.getCentro().getDistancia(c2.getCentro()));
    }
}
