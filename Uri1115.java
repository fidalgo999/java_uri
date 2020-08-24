import java.util.Scanner;
public class Uri1115{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float X=1;
        float Y=1;

        while (X != 0 || Y != 0) {                
        X = teclado.nextFloat();
        Y = teclado.nextFloat();

        if ( X != 0 && Y != 0){

            if ( X != 0 && Y != 0 && X >0 && Y > 0 ) {
                System.out.println("primeiro");
            }
            else if ( X != 0 && Y != 0 && X > 0 && Y < 0 ) {
                System.out.println("quarto");
            }
            else if ( X != 0 && Y != 0 && X <0 && Y > 0 ) {
                System.out.println("segundo");
            }
            else if ( X != 0 && Y != 0 && X < 0 && Y < 0 ) {
                System.out.println("terceiro");
            }
        }
        else {
            break;
        }
        }
    }
}