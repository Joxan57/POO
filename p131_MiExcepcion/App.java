package p131_MiExcepcion;

public class App {
    static int sumar(int a, int b) throws FueraDeRango{
        if(a < 0 || b < 0){
            throw new FueraDeRango("Los numeros deben ser positivos");
        }
        return a + b;
    }

    public static void main(String[] args) {
        try{
            System.out.println(sumar(5, 10));
            System.out.println(sumar(-5, 10));
        }catch(FueraDeRango e){
            System.out.println(e.getMessage());
        }
    }
}
