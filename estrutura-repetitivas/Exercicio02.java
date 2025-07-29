import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a coordenada de X: ");
        int coordX = sc.nextInt();
        System.out.println("Informe a coordenada de Y: ");
        int coordY = sc.nextInt();

        while (coordX != 0 && coordY != 0){

            if (coordX > 0 && coordY > 0) {
                System.out.println("Primeiro");
            } else if (coordX < 0 && coordY > 0) {
                System.out.println("Segundo");
            } else if (coordX < 00 && coordY < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }

            System.out.println("Informe a coordenada de X: ");
            coordX = sc.nextInt();
            System.out.println("Informe a coordenada de Y: ");
            coordY = sc.nextInt();
        }

        sc.close();
    }
}
