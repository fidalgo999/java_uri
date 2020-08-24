import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int NUMERO;
        int HORAS;
        float VALOR;
        double SALARIO;

        NUMERO = teclado.nextInt();
        HORAS = teclado.nextInt();
        VALOR = teclado.nextFloat();

        SALARIO = HORAS * VALOR;

        System.out.println("NUMBER = " + NUMERO);
        System.out.printf("SALARY = U$ %.2f\n" , SALARIO);
    }
}