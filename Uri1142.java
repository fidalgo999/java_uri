import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X = 1;

        int vezes; 
        vezes = teclado.nextInt();
        
        for (int cont=1; cont<=vezes ; cont++){
            System.out.println(X+ " " +(X +1)+ " " +(X +2)+ " PUM");
            X = X + 4;         
        }
    }
}