package p110_FormaV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String MAGENTA = "\u001B[35m";
    private static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo("Rojo", true, 3.0));
        formas.add(new Circulo("Azul", false, 5.0));
        formas.add(new Circulo("Verde", true, 2.5));
        formas.add(new Rectangulo("Amarillo", true, 4.0, 6.0));
        formas.add(new Rectangulo("Morado", false, 3.5, 2.0));

        limpiarConsola();
        System.out.println(BOLD + CYAN + "=== FORMAS GEOMETRICAS ===" + RESET);

        System.out.println("\n" + BOLD + YELLOW + "Datos de las formas" + RESET);
        for (Forma forma : formas) {
            String tipo = obtenerTipo(forma);
            System.out.println(obtenerIcono(forma) + " Tipo: " + tipo + " | " + forma);
        }

        double areaCirculos = 0;
        double perimetroCirculos = 0;
        double areaRectangulos = 0;
        double perimetroRectangulos = 0;

        System.out.println("\n" + BOLD + GREEN + "Areas y perimetros" + RESET);
        for (Forma forma : formas) {
            double area = forma.getArea();
            double perimetro = forma.getPerimetro();
            String tipo = obtenerTipo(forma);

            System.out.printf(Locale.US, "%s %s -> Area: %.2f | Perimetro: %.2f%n",
                    obtenerIcono(forma), tipo, area, perimetro);

            if (forma instanceof Circulo) {
                areaCirculos += area;
                perimetroCirculos += perimetro;
            } else if (forma instanceof Rectangulo) {
                areaRectangulos += area;
                perimetroRectangulos += perimetro;
            }
        }

        System.out.println("\n" + BOLD + MAGENTA + "Totales por tipo de forma" + RESET);
        System.out.printf(Locale.US, "(O) Circulos    -> Area total: %.2f | Perimetro total: %.2f%n",
                areaCirculos, perimetroCirculos);
        System.out.printf(Locale.US, "[=] Rectangulos -> Area total: %.2f | Perimetro total: %.2f%n",
                areaRectangulos, perimetroRectangulos);
    }

    private static String obtenerTipo(Forma forma) {
        if (forma instanceof Circulo) {
            return "Circulo";
        }
        if (forma instanceof Rectangulo) {
            return "Rectangulo";
        }
        return forma.getClass().getSimpleName();
    }

    private static String obtenerIcono(Forma forma) {
        if (forma instanceof Circulo) {
            return "(O)";
        }
        if (forma instanceof Rectangulo) {
            return "[=]";
        }
        return "<>";
    }

    private static void limpiarConsola() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }
}
