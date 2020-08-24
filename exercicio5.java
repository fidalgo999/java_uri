import java.util.Scanner;
public class exercicio5{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        float tempo;
        float veloc;
        float litros;

        System.out.println("Digite Tempo de viagem: ");
        tempo = teclado.nextFloat();
        System.out.println("Digite velocidade media: ");
        veloc = teclado.nextFloat();

        litros = (veloc / 12) * tempo;
        System.out.println("Quantidade de litros para a viagem = " + litros);
    }
}
    