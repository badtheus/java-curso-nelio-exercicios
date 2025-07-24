import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area,raio,pi=3.14159;

        System.out.println("Informe o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A área do círculo é: %.4f%n",area);

        sc.close();
    }
}
