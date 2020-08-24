import java.util.Scanner;
public class Uri1041{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float X;
        float Y;
                        
        X = teclado.nextFloat();
        Y = teclado.nextFloat();

        if ( X != 0 && Y != 0 && X >0 && Y > 0 ) {
            System.out.println("Q1");
        }
        else if ( X != 0 && Y != 0 && X > 0 && Y < 0 ) {
            System.out.println("Q4");
        }
        else if ( X != 0 && Y != 0 && X <0 && Y > 0 ) {
            System.out.println("Q2");
        }
        else if ( X != 0 && Y != 0 && X < 0 && Y < 0 ) {
            System.out.println("Q3");
        }
        else if ( X == 0 && Y != 0 ) {
            System.out.println("Eixo Y");
        }
        else if ( X !=0 && Y == 0 ) {
            System.out.println("Eixo X");
        }
        else {
            System.out.println("Origem");
        }  
    }
}