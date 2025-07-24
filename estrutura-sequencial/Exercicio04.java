import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero,horas;
        double valorHora,salario;

        System.out.println("Número do funcionário: ");
        numero = sc.nextInt();

        System.out.println("Quantidade de horas trabalhadas: ");
        horas = sc.nextInt();

        System.out.println("Valor recebido por hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.println("Numero: " + numero);
        System.out.printf("Salário: R$ %.2f%n " , salario);

        sc.close();
    }
}
