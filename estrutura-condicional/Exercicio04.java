import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int horaInicial,horaFinal,duracao;

        System.out.println("Informe a hora que começou o jogo: ");
        horaInicial = sc.nextInt();
        System.out.println("Informe a hora que terminou o jogo: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " HORA(S)");

        sc.close();
    }
}
