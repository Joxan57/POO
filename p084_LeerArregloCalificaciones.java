import java.util.Scanner;

void main() {

    Scanner obj = new Scanner(System.in);
    
    ArrayList<Float> cals = new ArrayList<>();
    
    float suma=0, promedio=0;

    System.out.println("Cuantas Calificaciones deseas Procesar : "); 
    int n = obj.nextInt();

    for(int i=0; i < n; i++ ){
        System.out.printf("Calificacion %d ?", i + 1);
        Float cal = obj.nextFloat();
        cals.add(cal);
        suma += cal; 

    }
        
    promedio = suma / cals.size();
    System.out.printf("la suma es %f", suma);
    System.out.printf("El promedio es de : %.2f", promedio);
    
    }