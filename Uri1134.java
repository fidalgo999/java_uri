import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int GAS = 0;
        int ALC = 0;
        int DIE = 0;
        int opcao = 0;
        

        while ( opcao != 4) {

            opcao = teclado.nextInt();

            if ( opcao == 1){
                ALC = ALC + 1;
            }
            else if ( opcao == 2){
                GAS = GAS + 1;
            }
            else if ( opcao == 3){
                DIE = DIE + 1;
            }
        }        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + ALC);
        System.out.println("Gasolina: " + GAS);
        System.out.println("Diesel: " + DIE);   
    }
}