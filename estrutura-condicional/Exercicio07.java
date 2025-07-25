import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valorX,valorY;

        System.out.println("Informe o valor X: ");
        valorX = sc.nextDouble();
        System.out.println("Informe o valor Y: ");
        valorY = sc.nextDouble();

        if (valorX == 0.0 && valorY == 0.0){
            System.out.println("Origem");
        } else if (valorX == 0.0) {
            System.out.println("Eixo Y");
        } else if (valorY == 0.0) {
            System.out.println("Eixo X");
        } else if (valorX > 0.0 && valorY > 0.0) {
            System.out.println("Q1");
        } else if (valorX < 0.0  && valorY > 0.0) {
            System.out.println("Q2");
        } else if (valorX < 0.0 && valorY < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
