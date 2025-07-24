import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA,valorB,soma;

        System.out.println("Informe o primeiro valor: ");
        valorA = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        valorB = sc.nextInt();

        soma = valorA + valorB;

        System.out.println("SOMA = " + soma);
    }
}
