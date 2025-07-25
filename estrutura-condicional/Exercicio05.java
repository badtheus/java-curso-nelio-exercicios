import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo,quantidade;
        double total = 0;

        System.out.println("Informe o código: ");
        codigo = sc.nextInt();
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();

        if (codigo == 1){
            total = quantidade * 4.0;
        } else if (codigo == 2){
            total = quantidade * 4.5;
        } else if (codigo == 3 ){
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else if (codigo == 5) {
            total = quantidade * 1.5;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);
        sc.close();
    }
}
