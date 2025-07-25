import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Informe o valor: ");
        valor = sc.nextInt();

        if (valor % 2 ==0){
            System.out.println("O número é PAR!");
        } else {
            System.out.println("O número é ÍMPAR!");
        }

        sc.close();
    }
}
