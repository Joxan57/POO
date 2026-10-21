package p116_Animal;

public class Gato implements Animal{

    @Override
    public void dormir() {
        System.out.println("El gato esta durmiendo");
        
    }

    @Override
    public void sonido() {
        System.out.println("Miau");
        
    }
    
}
