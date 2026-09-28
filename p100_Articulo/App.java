package p100_Articulo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Articulo articulo1 = new Articulo("A101", "Pluma Roja", 888, 0.08);
        Articulo articulo2 = new Articulo("A101", "Pluma Roja", 999, 0.99);

        System.out.println(articulo1);
        System.out.println(articulo2);
        System.out.println("Id es: " + articulo2.getId());
        System.out.println("Desc es: " + articulo2.getDesc());
        System.out.println("Cant es: " + articulo2.getCant());
        System.out.printf("PrecioUnit es: %.2f%n", articulo2.getPrecioUnit());
        System.out.printf("El Total es: %.2f%n", articulo2.getTotal());
    }
}
