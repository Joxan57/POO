import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

public float mayor(ArrayList<Float> t) {
    float mayor = t.get(0);
    for (Float xt : t)
        if (xt > mayor)
            mayor = xt;
    return mayor;
}

public float promedio(ArrayList<Float> t) {
    float suma = 0;
    for (Float xt : t)
        suma += xt;
    return suma / t.size();
}

public void mostrar(ArrayList<Float> t) {
    for (Float xt : t)
        System.out.printf("%.2f ", xt);
}

public int buscar(ArrayList<Float> t, double valor) {
    for (int i = 0; i < t.size(); i++)
        if (t.get(i).doubleValue() == valor)
            return i;
    return -1;
}

void main() {
    ArrayList<Float> temps = new ArrayList<>(
            List.of(12.34f, 56.22f, 56.78f, 100.0f, 10.25f));
    double temp = 10.25;
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("\nLas temperaturas son:");
    mostrar(temps);
    System.out.printf("\nLa mayor es: %.2f", mayor(temps));
    System.out.printf("\nEl promedio es: %.2f", promedio(temps));
    int pos = buscar(temps, temp);
    if (pos != -1)
        System.out.printf("\n%.2f está en la posición %d", temp, pos);
    else
        System.out.println("\nEl elemento no existe");
}