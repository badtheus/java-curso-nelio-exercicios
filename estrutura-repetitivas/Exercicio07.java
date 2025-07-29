import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe o primeiro valor: ");
            double valorX = sc.nextDouble();

            System.out.println("Informe o segundo valor: ");
            double valorY = sc.nextDouble();

            if (valorY == 0) {
                System.out.println("Divisão impossivel!");
            } else {
                double div = valorX / valorY;
                System.out.printf("%.1f%n", div);
            }

        }

        sc.close();
    }
}
