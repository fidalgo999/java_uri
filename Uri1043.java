import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float A;
        float B;
        float C;
        float PERI;
        float AREA;
                                
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
        
        if ( (A+B) > C && (B+C) > A && (A+C) > B ) {
            PERI = A+B+C;
            System.out.printf("Perimetro =  %.1f\n" , PERI);
        }
        else {
            AREA = (C * (A+B)) / 2;
            System.out.printf("Area = %.1f\n" , AREA);
        }
    }
}