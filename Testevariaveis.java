public class Testevariaveis{
    public static void main(String args[]){
        int a,b,c;
        a = 10;
        b = 8;
        c = a + b;

        System.out.println("Valor de a =" + a);
        System.out.println("Valor de b =" + b);
        System.out.println("Valor de c =" + c);

        c = a / b;
        System.out.println("Valor de c =" + c);

        c = a % b;
        System.out.println("Valor de resto de c =" + c);

        double x,y,z;
        x = 10.0;
        y = 8.0;
        z = x / y;

        System.out.println("Valor de x =" + x);
        System.out.println("Valor de y =" + y);
        System.out.println("Valor de z =" + z);

        // printf - print formatado
        // %f - para float/double
        // %d - para interiros

        System.out.printf("Valor de x = %.2f\n" , x);
        System.out.printf("Valor de y = %.2f\n" , y);
        System.out.printf("Valor de z = %.2f\n" , z);

        System.out.printf("Os valores sao %.2   %.2   %.2f\n" , x , y , z);
    }
}