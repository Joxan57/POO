package p105_PuntoTriangulo;

public class App {

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(
                new Punto(5, 5),
                new Punto(15, 15),
                new Punto(5, 25));

        Triangulo triangulo2 = new Triangulo(
                new Punto(15, 5),
                new Punto(15, 15),
                new Punto(5, 25));

        System.out.println(triangulo1);
        System.out.println();
        System.out.println(triangulo2);
        System.out.println();

        imprimirDato("Triangulo 1 - Vertice 1", triangulo1.getV1());
        imprimirDato("Triangulo 1 - Vertice 2", triangulo1.getV2());
        imprimirDato("Triangulo 1 - Vertice 3", triangulo1.getV3());
        imprimirDato("Triangulo 1 - Perimetro", triangulo1.getPerimetro());
        imprimirDato("Triangulo 1 - Tipo", triangulo1.getTipo());
    }

    private static void imprimirDato(String etiqueta, Object valor) {
        System.out.printf("%-25s: %s%n", etiqueta, valor);
    }
}
