import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Digite o número do produto: ");
        int tentativa = sc.nextInt();

        while (tentativa != 4) {
            if (tentativa == 1) {
                alcool = alcool + 1;
            } else if (tentativa == 2) {
                gasolina = gasolina + 1;
            } else if (tentativa == 3) {
                diesel = diesel + 1;
            }

            System.out.println("Digite o número do produto: ");
            tentativa = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
