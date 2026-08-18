public class p005_OperacionesMatematicas {
    public static void main(String[] args) {
        float x, y, suma, resta, mult, divi, modu, pot;
        
        x = 10.5f;
        y = 2.5f;

        suma = x + y;
        resta = x - y;
        mult = x * y;
        divi = x / y;
        modu = x % y;
        pot = (float) Math.pow(x,y);

        System.out.printf("la suma de %.2f + %.2f es = %.2f \n",x,y,suma);
        System.out.printf("la resta de %.2f - %.2f es = %.2f \n",x,y,resta);
        System.out.printf("la multiplicacion de %.2f * %.2f es = %.2f \n",x,y,mult);
        System.out.printf("la division de %.2f / %.2f es = %.2f \n",x,y,divi);
        System.out.printf("el modulo de %.2f %% %.2f es = %.2f \n",x,y,modu);
        System.out.printf("la potencia de %.2f ^ %.2f es = %.2f \n",x,y,pot);
    }

    
}