package p098_Circulo;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10.4);
        Circulo c2 = new Circulo(12.45);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("El radio es : " + c2.getRadio());
        System.out.println("El area es : " + c1.getArea());
        System.out.println("El area es : " + c1.getCircunferencia());

    }
    
}
