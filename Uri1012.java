import java.util.Scanner;
public class Uri1012{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A;
        double B;
        double C;
        double ATRI, ACIR, ATRA, AQUAD, ARET;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        ATRI = A * C / 2;
        ACIR = 3.14159 * C * C;
        ATRA = (A + B) * C / 2;
        AQUAD = B * B;
        ARET = A * B;

        System.out.printf("TRIANGULO: %.3f\n" , ATRI);
        System.out.printf("CIRCULO: %.3f\n" , ACIR);
        System.out.printf("TRAPEZIO: %.3f\n" , ATRA);
        System.out.printf("QUADRADO: %.3f\n" , AQUAD);
        System.out.printf("RETANGULO: %.3f\n" , ARET);
    }
}