
//indice 0 vai ser o msb

import java.util.Scanner;

public class ComplementoDois {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        char tipo = ' ';
        int numDecimal = 0;
        int TAM_VETOR = 20;
        int[] numBinario = new int[20];
        int[] valorBit = { 1048576, 524288, 262144, 131072, 65536, 32768, 16384,
                        8192, 4096, 2048, 1024, 512, 128, 64, 32, 16, 8, 4, 2, 1 };

        tipo = lerChar();

        switch (tipo) {
            case 'D':
                numDecimal = lerNumInt();
                numBinario = converterBinario(numDecimal, valorBit);
                for (int i = 0; i < numBinario.length; i++) {
                    System.out.print(numBinario[i] + " ");
                }
                break;
            case 'B':
                numBinario = lerVetor(TAM_VETOR);
                numDecimal = converterDecimal(numBinario);
                System.out.println(numDecimal);
                break;
        }
    }

    public static int converterDecimal(int[] numBinario) {
        int numDecimal = 0;
        int n = 20;
        if (numBinario[0] == 1) {
            numDecimal += -Math.pow(2, n);
        }
        n--;
        for (int i = 0; i < numBinario.length; i++) {
            numDecimal += numBinario[i] * Math.pow(2, n);
            n--;
        }

        return numDecimal;
    }

    public static int[] converterBinario(int numDecimal, int[] valorBit) {
        int[] numBinario = new int[20];

        int acc = 0;
        if (numDecimal > 0) {
            numBinario[0] = 0;
        } else if (numDecimal < 0) {
            numBinario[0] = 1;
            acc += -valorBit[0];
        } else {
            for (int i = 0; i < numBinario.length; i++) {
                numBinario[i] = 0;
            }
        }
        for (int i = 1; i < numBinario.length; i++) {
            if (acc + valorBit[i] <= numDecimal) {
                acc += valorBit[i];
                numBinario[i] = 1;
            } else {
                numBinario[i] = 0;
            }
        }

        return numBinario;
    }

    public static int lerNumInt() {
        return Sc.nextInt();
    }

    public static char lerChar() {
        return Sc.next().charAt(0);
    }

    public static int[] lerVetor(int TAM_VETOR) {
        int[] vetor = new int[TAM_VETOR];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumInt();
        }
        return vetor;
    }
}