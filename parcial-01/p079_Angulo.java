import java.util.Scanner;


    public String evaluarAngulo(double angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo > 90 && angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else if (angulo > 180 && angulo < 360) {
            return "Cóncavo";
        } else {
            return "Completo"; // Para cuando es exactamente 360
        }
    }

    void main() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        System.out.print("Introduce un ángulo (0-360): ");
        double angulo = obj.nextDouble();

        if (angulo >= 0 && angulo <= 360) {
            System.out.println("Tipo de ángulo: " + evaluarAngulo(angulo));
        } else {
            System.out.println("Error: El ángulo debe estar en el rango de 0 a 360.");
        }
    }
