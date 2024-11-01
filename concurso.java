import java.util.Arrays;
import java.util.Scanner;

public class concurso {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int notaCorte = 0;
        int qtdCandidatos = lerNumInt();
        int minAprovados = lerNumInt();
        int[] notaCandidato = new int[qtdCandidatos];

        notaCandidato = lerVetor(notaCandidato);
        notaCorte = definirNotaCorte(notaCandidato, qtdCandidatos, minAprovados);
        imprimir(notaCorte + "");
    }

    public static int definirNotaCorte(int[] notaCandidato, int qtdCandidatos, int minAprovados) {
        int notaCorte = 0;
        Arrays.sort(notaCandidato);
        notaCorte = notaCandidato[qtdCandidatos - minAprovados];
        return notaCorte;
    }

    public static int lerNumInt() {
        int valorInt = 0;
        do {
            valorInt = Sc.nextInt();
        } while (valorInt > 100 || valorInt < 0);
        return valorInt;
    }

    public static int lerNota() {
        int valorInt = 0;
        do {
            valorInt = Sc.nextInt();
        } while (valorInt > 500 || valorInt < 1);
        return valorInt;
    }

    public static int[] lerVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumInt();
        }
        return vetor;
    }

    public static void imprimir(String string) {
        System.out.println(string);
    }
}
