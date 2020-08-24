import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int INICIO;
        int FIM;
        int TOTAL;
        int ST;
                        
        INICIO = teclado.nextInt();
        FIM = teclado.nextInt();

        ST = FIM - INICIO;

        if ( ST > 0 ) {
            TOTAL = FIM - INICIO;
            System.out.println("O JOGO DUROU " + TOTAL + " HORA(S)");
            }
        else if ( ST < 0 ) {
            TOTAL = 24 - INICIO + FIM;
            System.out.println("O JOGO DUROU "  + TOTAL + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}