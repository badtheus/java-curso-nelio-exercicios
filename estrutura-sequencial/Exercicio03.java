import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valorA,valorB,valorC,valorD,diferenca;

        System.out.println("Informe o primeiro valor: ");
        valorA = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        valorB = sc.nextInt();
        System.out.println("Informe o terceiro valor: ");
        valorC = sc.nextInt();
        System.out.println("Informe o quarto valor: ");
        valorD = sc.nextInt();

        diferenca = (valorA * valorB - valorC * valorD);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
