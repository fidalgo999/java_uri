import java.util.Scanner;
public class exercicio3{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        float salmin;
        float kw;
        float valkwreais;
        float valreais;
        double desconto;

        System.out.println("Digite o Salario minimo: ");
        salmin = teclado.nextFloat();
        System.out.println("Digite kw: ");
        kw = teclado.nextFloat();

        valkwreais = (salmin / 7) /100;
        System.out.println("Valor por kw = " + valkwreais);

        valreais = salmin / 7;
        System.out.println("Valor a ser pago = " + valreais);

        desconto = valreais * 0.9f;
        System.out.printf("Valor com desconto = " + desconto);
    }
}