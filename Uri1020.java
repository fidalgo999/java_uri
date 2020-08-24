import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int IDADE;
        int ANO;
        int RESTO;
        int MES;
        int DIA;
                
        IDADE = teclado.nextInt();

        ANO = IDADE / 365;
        RESTO = ANO % 365;

        System.out.println("ano(s)" + ANO);

        MES = RESTO / 30;

        System.out.println("mes(es)" + MES);

        DIA = RESTO % 30;

        System.out.println("dia(s)" + DIA);
    }
}