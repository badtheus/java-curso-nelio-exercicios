import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.println("Informe o valor a ser verificado: ");
        valor = sc.nextInt();

        if (valor > 0) {
            System.out.println("O valor é positivo!");
        } else {
            System.out.println("O valor é negativo!");
        }

        sc.close();
    }
}
