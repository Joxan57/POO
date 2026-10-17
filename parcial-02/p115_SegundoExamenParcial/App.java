package p115_SegundoExamenParcial;

/*la clase Flota gestiona los objetos a través de una 
* lista polimórfica (List<Vehiculo>). Cuando se recorre la colección 
* mediante un bucle for-each para invocar los métodos v.getBonoConductor() o 
* imprimir los objetos con System.out.println(v), el compilador de Java 
* utiliza el enlace dinámico (late binding / dynamic dispatch).
* A nivel de tiempo de ejecución (runtime), la Máquina Virtual de Java (JVM) 
* no resuelve cuál versión específica del método ejecutar basándose en el tipo 
* estático de la referencia (la clase base abstracta Vehiculo), sino consultando 
* la tabla de métodos virtuales (vtable) del objeto real en memoria (ya sea 
* una instancia de CamionCarga o de AutobusPasajeros).
* Esto permite que el sistema sea altamente extensible y desacoplado, invocando 
* automáticamente las fórmulas particulares de cada subclase sin requerir 
* condicionales ni casteos manuales de tipos.*/

public class App {
    public static void main(String[] args) {
        //  Crear la flota
        Flota flotaNorte = new Flota("Norte", "Monterrey");

        // Reporte Inicial (Flota vacía)
        System.out.println("Reporte Inicial");
        System.out.println(flotaNorte);
        System.out.println();

        //  Agregar los vehículos con los datos de prueba exactos del examen
        flotaNorte.agregarVehiculo(new CamionCarga("Volvo", "FMX", 30000, 2500.0, 4, 5000.0));
        flotaNorte.agregarVehiculo(new CamionCarga("Kenworth", "T680", 28000, 1800.0, 3, 4200.0));
        flotaNorte.agregarVehiculo(new AutobusPasajeros("Mercedes", "O500", 50, 1200.0, 5, 8500));
        flotaNorte.agregarVehiculo(new AutobusPasajeros("Irizar", "i6", 40, 1500.0, 8, 12000));
        flotaNorte.agregarVehiculo(new AutobusPasajeros("Scania", "K360", 45, 950.0, 4, 6200));

        // Reporte Final con Datos de Prueba
        System.out.println("Reporte Final con Datos de Prueba");
        flotaNorte.reporte();
        System.out.println(flotaNorte);
    }
}