import java.util.Scanner;

public class MaquinaMurilo {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        // ? Declaração de variaveis
        final int maxEspacos = 5;
        int[] fig1 = new int[maxEspacos];
        int[] fig2 = new int[maxEspacos];
        int qtdVezesCompativel = 0;
        boolean seEncaixou = false;
        String saida = null;

        // ? Entrada de dados
        fig1 = lerVetor(fig1);
        fig2 = lerVetor(fig2);

        // ? Processamento de dados
        qtdVezesCompativel = compararVetores(fig1, fig2, qtdVezesCompativel, maxEspacos);
        seEncaixou = verificarSeEncaixou(maxEspacos, qtdVezesCompativel);
        saida = converterString(seEncaixou);

        // ? Saida de dados
        imprimir(saida);

    }

    public static int[] lerVetor(int array[]) {

        for (int i = 0; i < array.length; i++) {
            array[i] = lerNumeroInteiro();
        }

        return array;
    }

    public static int lerNumeroInteiro() {
        int valor = 0;
        valor = LER.nextInt();
        return valor;
    }

    public static int compararVetores(int[] fig1, int[] fig2, int qtdVezesCompativel, final int maxEspacos) {

        for (int i = 0; i < maxEspacos; i++) {

            if (fig1[i] != fig2[i]) {
                qtdVezesCompativel++;
            }
        }

        return qtdVezesCompativel;
    }

    public static boolean verificarSeEncaixou(int maxEspacos, int qtdVezesCompativel) {

        boolean booleano = false;

        if (qtdVezesCompativel == maxEspacos) {
            booleano = true;
        }

        return booleano;
    }

    public static String converterString(boolean seEncaixou) {
        String texto = null;

        if (seEncaixou) {
            texto = "Y";
        } else {
            texto = "N";
        }

        return texto;
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

}