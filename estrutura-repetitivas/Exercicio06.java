import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o número: ");
            double valorA = sc.nextDouble();
            System.out.println("Digite o número: ");
            double valorB = sc.nextDouble();
            System.out.println("Digite o número: ");
            double valorC = sc.nextDouble();

            double media = (valorA * 2.0 + valorB * 3.0 + valorC * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
