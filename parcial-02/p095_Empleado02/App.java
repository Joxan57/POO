package p095_Empleado02;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Juan Perez");
        empleado1.setEdad(35);
        System.out.println(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Maria de Jesus");
        empleado2.setEdad(16);
        System.out.println(empleado2);

        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
    }
}
