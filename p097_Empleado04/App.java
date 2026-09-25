package p097_Empleado04;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan Perez", 35, 'H', true));
        empleados.add(new Empleado("Maria de Jesus", 16, 'M', false));
        empleados.add(new Empleado("Dario Jimenez", 33, 'H', true));
        empleados.add(new Empleado("Jessica Jimenez", 45, 'M', true));

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nLos empleados en el ArrayList");
        for (Empleado empleado : empleados)
            System.out.println(empleado);

        System.out.println("\nEl primer elemento del ArrayList");
        System.out.println(empleados.get(0));

        int suma = 0;
        int hombres = 0;
        int mujeres = 0;
        int casados = 0;
        int noCasados = 0;

        for (int pos = 0; pos < empleados.size(); pos++) {
            Empleado empleado = empleados.get(pos);
            suma += empleado.getEdad();
            if (empleado.getSexo() == 'H')
                hombres++;
            else
                mujeres++;
            if (empleado.getCasado())
                casados++;
            else
                noCasados++;
        }

        System.out.println("\nRealizando cálculos:");
        System.out.println("Promedio de edades: " + (suma / empleados.size()));
        System.out.println("Hombres: " + hombres);
        System.out.println("Mujeres: " + mujeres);
        System.out.println("Casados: " + casados);
        System.out.println("No casados: " + noCasados);
    }
}
