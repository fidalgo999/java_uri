import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        int number;
        
        X = teclado.nextInt();
        
        for (int cont=1; cont<=X ; cont++){
        number = teclado.nextInt();

            if (number % 2 == 0 && number != 0){
                System.out.print("EVEN");
                if (number < 0){
                    System.out.println(" NEGATIVE");
                }
                else {
                    System.out.println(" POSITIVE");
                }
            }
            else {
                if (number % 2 != 0 && number != 0){
                    System.out.print("ODD");
                    if (number < 0){
                        System.out.println(" NEGATIVE");  
                    }
                    else {
                        System.out.println(" POSITIVE");
                    }
                }
                else {
                    System.out.println("NULL");
                }
            }
        }
    }
}