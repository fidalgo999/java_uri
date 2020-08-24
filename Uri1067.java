import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num;          // o número que eu leio
        int   positivos=0;  // meu contador de positivos
        float total=0;
        float media=0;

        /* passos para resolver:
           sei fazer a contagem de números positivos para 1 único valor? SIM
           se eu sei fazer isso para 1 único valor, envolvo esta lógica em uma repetição 
        */
        for (int cont=1; cont<=6 ; cont++){  // se sei resolver 1, contando até 6, resolvo o problema
            num = teclado.nextFloat();
            if (num > 0){
                positivos++;
                total = total + num;
                media = total / positivos;
            }
        }

        System.out.println(positivos+" valores positivos");
        System.out.printf("%.1f\n" , media);
        
    }
}