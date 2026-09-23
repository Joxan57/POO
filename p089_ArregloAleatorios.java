import java.util.ArrayList;
import java.util.Random;

public void aleatorio(ArrayList<Float> nums, int n) {
    float min=0f,max=100f;
    Random na = new Random();
    for (int pos = 0; pos < n; pos++)
        nums.add(pos, na.nextFloat(max - min) + min);

}

public void mostrar(ArrayList<Float> nums ) {
    for (Float num : nums ) System.out.printf("%.2f",num);
}
public void suma(ArrayList<Float> A, ArrayList<Float> B, ArrayList<Float> C){
    for(int pos=0; pos<A.size(); pos++)
        C.set( pos, A.get(pos) + B.get(pos));
}
void main(){
    int n = 10;
    ArrayList<Float> A = new ArrayList<>();
    ArrayList<Float> B = new ArrayList<>();
    ArrayList<Float> C = new ArrayList<>();
    System.out.print("\033[H\033[2J\033[3J");
    
    System.out.println("Elementos aleatorios en A : ");
    aleatorio(A,n);
    mostrar(A);

    System.out.println("Elementos aleatorios en B : ");
    aleatorio(B,n);
    mostrar(B);

    System.out.println("Elementos sumados de A y B : ");
    aleatorio(A,n);
    mostrar(A);
}