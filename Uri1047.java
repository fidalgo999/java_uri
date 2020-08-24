import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int HORA_INICIO;
        int HORA_FIM;
        int MIN_INICIO;
        int MIN_FIM;
        int DURACAO_FINAL;
        int DURACAO_INICIAL;
        
                        
        HORA_INICIO = teclado.nextInt();
        HORA_FIM = teclado.nextInt();
        MIN_INICIO = teclado.nextInt();
        MIN_FIM = teclado.nextInt();

        HORA_ST = HORA_FIM - HORA_INICIO;
        MIN_ST = MIN_FIM - MIN_INICIO;

        if ( HORA_ST > 0 && MIN_ST > 0 ) {
            HORA_TOTAL = HORA_FIM - HORA_INICIO;
        }
        else if ( MIN_ST < 0 ) {
            MIN_TOTAL = 60 - MIN_INICIO + MIN_FIM;

            System.out.print("O JOGO DUROU " + HORA_TOTAL);
            System.out.print(" HORA(S) E" + MIN_TOTAL);
            System.out.println("MINUTO(S)");
        }
        else if ( HORA_ST < 0 && MIN_ST < 0 ) {
            HORA_TOTAL = 24 - HORA_INICIO + HORA_FIM;
            MIN_TOTAL = 60 - MIN_INICIO + MIN_FIM;
            System.out.print("O JOGO DUROU " + HORA_TOTAL);
            System.out.print(" HORA(S) E" + MIN_TOTAL);
            System.out.println("MINUTO(S)");
        }
    }
}