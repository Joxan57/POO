import java.util.Scanner;


    public int sumaMultiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        int contador = 0;
        System.out.print("Múltiplos encontrados: ");

        boolean primerElemento = true;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0) {
                if (!primerElemento) {
                    System.out.print(", ");
                }
                System.out.print(i);
                suma += i;
                contador++;
                primerElemento = false;
            }
        }
        System.out.println();
        System.out.println("Total de múltiplos: " + contador);

        return suma;
    }

    void main() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        System.out.println("Menú:");
        System.out.println("1. Suma múltiplos de 3");
        System.out.println("2. Suma múltiplos de 4");
        System.out.print("Selecciona opción: ");
        int opcion = obj.nextInt();

        int multiplo = 0;
        if (opcion == 1) multiplo = 3;
        else if (opcion == 2) multiplo = 4;
        else {
            System.out.println("Opción inválida");
            return;
        }

        System.out.print("Introduce inicio: ");
        int ini = obj.nextInt();
        System.out.print("Introduce fin: ");
        int fin = obj.nextInt();

        if (ini < fin) {
            int suma = sumaMultiplos(ini, fin, multiplo);
            System.out.println("La suma de los múltiplos de " + multiplo + " es: " + suma);
        } else {
            System.out.println("Error: El inicio debe ser menor que el fin (ini < fin).");
        }
    }
