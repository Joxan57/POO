import java.util.Scanner;

public class p038_AceptarEstudianteV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner obj = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = obj.nextLine();

        int sexo;
        float c1, c2, c3, promedio;
        
        System.out.print("Sexo : [ 1 ] Hombre, [ 2 ] Mujer: ");
        sexo = obj.nextInt();
        
        System.out.print("Edad: ");
        int edad = obj.nextInt();
        
        System.out.print("Calificacion 1: ");
        c1 = obj.nextFloat();
        System.out.print("Calificacion 2: ");
        c2 = obj.nextFloat();
        System.out.print("Calificacion 3: ");
        c3 = obj.nextFloat();

        promedio = (c1 + c2 + c3) / 3;

        if (sexo == 2 && edad > 21 && promedio >= 8 && promedio <= 9.5) {
            System.out.printf("Nombre : %s\nSexo : Mujer\nEdad : %d\nPromedio : %.2f\n", nombre, edad, promedio);
            System.out.println("Resultado: Estudiante aceptada.");
        } else {
            System.out.printf("Nombre : %s\nSexo : Hombre\nEdad : %d\nPromedio : %.2f\n", nombre, edad, promedio);
            System.out.println("Resultado: Estudiante rechazada.");
        }
    }
}