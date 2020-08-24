import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;      // o número que eu leio

        X = teclado.nextInt();

        if (X % 2 == 0){
            X = X + 1;

            for (int cont=1; cont<=6 ; cont++){
                System.out.println(X);
                X = X + 2;
            }
        }
        else {
            System.out.println(X);
            for (int cont=1; cont<=5 ; cont++){
                X = X + 2;
                System.out.println(X);
            }
        }
    }
}