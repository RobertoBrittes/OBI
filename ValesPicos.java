
import java.util.Scanner;

public class ValesPicos {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdMedidas = 0;
        int[] altura;
        int seguePadrao = 0;

        qtdMedidas = lerNumInt();
        altura = new int[qtdMedidas];
        altura = lerVetor(qtdMedidas);

        seguePadrao = verificarPadrao(altura);

        imprimir("" + seguePadrao);

    }

    public static void imprimir(String string) {
        System.out.println(string);
    }

    public static int verificarPadrao(int[] altura) {
        int seguePadrao = 0;
        String[] valePico = { null, null };
        for (int i = 1; i < altura.length; i++) {
            if (altura[i] > altura[i - 1]) {
                valePico[1] = "pico";
            } else if (altura[i] < altura[i - 1]) {
                valePico[1] = "vale";
            } else {
                seguePadrao = 0;
                break;
            }
            if (valePico[1] != valePico[0]) {
                seguePadrao = 1;
            } else {
                seguePadrao = 0;
                break;
            }
            valePico[0] = valePico[1];
        }
        return seguePadrao;

    }

    public static int lerNumInt() {
        return Sc.nextInt();
    }

    public static int[] lerVetor(int qtdMedidas) {
        int[] vetor = new int[qtdMedidas];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumInt();
        }
        return vetor;
    }
}
