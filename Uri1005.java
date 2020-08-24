import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A;
        double B;
        double MEDIA;

        A = teclado.nextFloat();
        B = teclado.nextFloat();

        MEDIA = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n" , MEDIA);
    }
}