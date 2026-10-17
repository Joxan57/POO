package p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Carlos Castañeda", new Trabajo(1, "Profesor", 1200)),
            new Persona("Uriel Diaz", new Trabajo(2, "Secretario", 1500)),
            new Persona("Lourdes Santoyo", new Trabajo(3, "Intendente", 10000)),
            new Persona("Maria Lopez", new Trabajo(4, "Cocinera", 2500)),
            new Persona("Juan perez", new Trabajo(5, "Mandadero", -10))
        };

        System.out.print("\033[H\033[2J");
        System.out.flush();

        double totalSalarios = 0;
        for (Persona persona : personas) {
            Trabajo trabajo = persona.getTrabajo();
            System.out.printf("%s - %s - Salario: %.2f%n",
                    persona.getNombre(), trabajo.getRol(), trabajo.getSalario());
            totalSalarios += trabajo.getSalario();
        }

        System.out.println("Total de personas: " + personas.length);
        System.out.printf("Total de salarios: %.2f%n", totalSalarios);
    }
}
