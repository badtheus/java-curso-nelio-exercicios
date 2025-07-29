import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0, out = 0;

        System.out.println("Informe a quantidade de valores: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe um número: ");
            int valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " IN");
        System.out.println(out + " OUT");

        sc.close();
    }
}
