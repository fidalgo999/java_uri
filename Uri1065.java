import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;      // o número que eu leio

        if (X % 2 == 0){
            X = X + 1;
            System.out.println(X);
            
            for (int cont=1; cont<=5 ; cont++){
                X = X + 2;
                System.out.println(X);
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