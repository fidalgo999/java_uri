import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int CED100;
        int CED50;
        int CED20;
        int CED10;
        int CED5;
        int CED2;
        int CED1;
        int RESTO;
        int VALOR;
                
        VALOR = teclado.nextInt();

        System.out.println(VALOR);

        CED100 = VALOR / 100;
        RESTO = VALOR % 100;

        System.out.println(CED100 + " nota(s) de R$ 100,00");
        
        CED50 = RESTO / 50;

        System.out.println(CED50 + " nota(s) de R$ 50,00");

        RESTO = RESTO % 50;

        CED20 = RESTO / 20;

        System.out.println(CED20 + " nota(s) de R$ 20,00");

        RESTO = RESTO % 20;

        CED10 = RESTO / 10;

        System.out.println(CED10 + " nota(s) de R$ 10,00");

        RESTO = RESTO % 10;

        CED5 = RESTO / 5;

        System.out.println(CED5 + " nota(s) de R$ 5,00");

        RESTO = RESTO % 5;

        CED2 = RESTO / 2;

        System.out.println(CED2 + " nota(s) de R$ 2,00");

        RESTO = RESTO % 2;

        CED1 = RESTO / 1;

        System.out.println(CED1 + " nota(s) de R$ 1,00");

        RESTO = RESTO % 1;
        
    }
}