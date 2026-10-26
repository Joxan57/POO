package p124_Vehiculo;

public class App {
    
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Vochito", "Joxan", 4);
        sedan.encender();
        sedan.desplazarse();
        sedan.arrancar();
        sedan.frenar();
        sedan.repostar();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();

        System.out.println("\n--------------------------------------------------\n");
        Suv suv = new Suv("La mamalona", "Joxan", 5);
        suv.encender();
        suv.desplazarse();
        suv.arrancar();
        suv.frenar();
        suv.repostar();
        suv.traccion4x4();
        suv.chasisIndependiente();

    }
}