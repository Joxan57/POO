import java.util.ArrayList;

void main() {

    ArrayList<Integer> edades = new ArrayList<>(
        List.of(15, 18, 30, 54, 21, 19, 20));
    ArrayList<String> nombres = new ArrayList<>(
        List.of("Juan", "Pedro", "Julian", "Francisco", "Teresa", "Camelia", "Benancio"));

    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    System.out.println("\nTodos los elementos con ciclo for-each:");
    for (Integer edad : edades) 
        System.out.printf("\n%d ", edad);
    
    System.out.println("\nLos nombres son :");
    for (String nombre : nombres ) 
    System.out.printf("\n%s", nombre);   

    System.out.println("\nNombres con sus respectivas edades : ");
    for(int pos=0; pos <= nombres.size()-1; pos++)
        System.out.printf("\nHola %s Tienes %d años%n", nombres.get(pos), edades.get(pos));
    
    
}