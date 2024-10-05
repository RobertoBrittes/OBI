import java.util.Arrays;
import java.util.Scanner;

public class concurso {
    final static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        int notaCorte = 0;
        int qtdCandidatos = lerNumInt();
        int minAprovados = lerNumInt();
        int[] notaCandidato = new int[qtdCandidatos];

        notaCandidato = lerVetor(qtdCandidatos);
        notaCorte = definirNotaCorte(notaCandidato, qtdCandidatos, minAprovados);
        System.out.println(notaCorte);
    }

    public static int definirNotaCorte(int[] notaCandidato, int qtdCandidatos, int minAprovados) {
        int notaCorte = 0;
        Arrays.sort(notaCandidato);
        notaCorte = notaCandidato[qtdCandidatos - minAprovados];
        return notaCorte;
    }

    public static int lerNumInt() {
        return Sc.nextInt();
    }

    public static int[] lerVetor(int qtdCandidatos) {
        int[] vetor = new int[qtdCandidatos];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumInt();
        }
        return vetor;
    }
}
