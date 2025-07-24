import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod01, cod02, qte01,qte02;
        double preco01,preco02,total;

        System.out.println("Informe o código da peça 1: ");
        cod01 = sc.nextInt();
        System.out.println("Informe o número de peças 1: ");
        qte01 = sc.nextInt();
        System.out.println("Informe o valor da peça 1: ");
        preco01 = sc.nextDouble();

        System.out.println("Informe o código da peça 2: ");
        cod02 = sc.nextInt();
        System.out.println("Informe o número de peças 2: ");
        qte02 = sc.nextInt();
        System.out.println("Informe o valor da peça 2: ");
        preco02 = sc.nextDouble();

        total = preco01 * qte01 + preco02 * qte02;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n ", total);

        sc.close();
    }
}
