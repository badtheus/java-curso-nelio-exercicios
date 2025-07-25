import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valorA,valorB;

        System.out.println("Informe o valor A: ");
        valorA = sc.nextInt();
        System.out.println("Informe o valor B: ");
        valorB = sc.nextInt();

        if (valorA % valorB == 0 || valorB % valorA == 0){
            System.out.println("Sao Multiplos!");
        } else {
            System.out.println("Não são Multiplos!");
        }
        sc.close();
    }
}
