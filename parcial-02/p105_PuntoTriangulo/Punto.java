package p105_PuntoTriangulo;

public class Punto {
    private int X;
    private int Y;

    public Punto() {
    }
    public Punto(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public double getDistancia(Punto p ){
        double diferenciaX = (double) p.getX() - X;
        double diferenciaY = (double) p.getY() - Y;
        return Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }
    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
    
}
