import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        int valor = sc.nextInt();

        for (int i = 1; i <= valor ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
