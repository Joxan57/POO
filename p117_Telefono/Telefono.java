package p117_Telefono;

public class Telefono implements Gps, Radio, Internet{

    @Override
    public void obtenerCordenadas() {
        System.out.println("Obteniendo Coordenadas");
        
    }

    @Override
    public void detenerRadio() {
        System.out.println("Deteniendo Radio");
        
    }
    
    @Override
    public void iniciarRadio() {
        System.out.println("Iniciando Radio");
        
    }

    @Override
    public void detenerWifi() {
        System.out.println("Deteniendo Wifi");
        
    }
    
    @Override
    public void iniciarWifi() {
        System.out.println("Iniciando WIfi");
        
    }
    
    @Override
    public void Navegando() {
        System.out.println("Navegando en la web");
        
    }
    
    
}
