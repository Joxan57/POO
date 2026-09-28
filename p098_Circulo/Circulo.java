package p098_Circulo;

public class Circulo {
    private double radio;

    public Circulo() {                      //Constructor vacio
    }

    public Circulo(double radio) {          //Costuctor Parametro
        this.radio = radio;
    }

    public double getRadio() {              //get del Radio
        return radio;
    }

    public void setRadio(double radio) {    //set del radio
        this.radio = radio;
    }

    public double getArea(){                
        return Math.PI*radio*radio;
    }

    public double getCircunferencia(){
        return Math.PI*radio*2;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }  
    

}
