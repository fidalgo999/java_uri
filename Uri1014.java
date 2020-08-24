import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X;
        float Y;
        double CONSUMO;
        
        X = teclado.nextInt();
        Y = teclado.nextFloat();

        CONSUMO = X / Y;

        System.out.printf("%.3f km/l\n" , CONSUMO);
    }
}