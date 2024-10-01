import java.util.Scanner;

public class MaquinaVerificacao {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAM_VETOR = 5;
        int[] x = new int[TAM_VETOR];
        int[] y = new int[TAM_VETOR];
        char compativel = 'Y';

        x = lerVetor(TAM_VETOR);
        y = lerVetor(TAM_VETOR);

        compativel = verificarCompativel(x, y);

        imprimir("" + compativel);
    }

    public static char verificarCompativel(int[] x, int[] y) {
        char compativel = 'Y';
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y[i]) {
                compativel = 'N';
                break;
            }
        }
        return compativel;
    }

    public static int lerNumInt() {
        return Sc.nextInt();
    }

    public static void imprimir(String string) {
        System.out.println(string);
    }

    public static int[] lerVetor(int TAM_VETOR) {
        int[] vetor = new int[TAM_VETOR];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumInt();
        }
        return vetor;
    }
}