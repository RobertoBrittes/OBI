
import java.util.Scanner;

public class TesteVetor {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int limMax = 0;
        limMax = lerNumInt();
        int[] fibonacci = new int[3];
        fibonacci [0] = 0;
        fibonacci [1] = 1;

        System.out.print(fibonacci[0]);
        System.out.print(" " + fibonacci[1]);

        for (int i = 2; i < limMax; i++) {
            fibonacci[2] = fibonacci[0] + fibonacci[1];
            System.out.print(" " + fibonacci[2]);
            fibonacci[0] = fibonacci[1];
            fibonacci[1] = fibonacci[2];
        }
        System.out.println();
    }

    public static int lerNumInt() {
        int valor = 0;
        do {
            valor = LER.nextInt();
        } while (valor < 0 || valor > 46);
        return valor;
    }
}