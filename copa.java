
import java.util.Scanner;

public class copa {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        float numKung = 0;
        float numLu = 0;
        String fase = null;

        numKung = lerNumFloat();
        do {
            numLu = lerNumFloat();
        } while (numLu == numKung);

        fase = verificarFase(numKung, numLu);

        imprimir(fase);

    }

    public static void imprimir(String string) {
        System.out.println(string);
    }

    public static String verificarFase(float numKung, float numLu) {
        String fase = null;
        numKung = Math.round(numKung / 2);
        numLu = Math.round(numLu  / 2);

        if (numKung == numLu) {
            fase = "oitavas";
        } else {
            numKung = Math.round(numKung / 2);
            numLu = Math.round(numLu / 2);
            if (numKung == numLu) {
                fase = "quartas";
            } else {
                numKung = Math.round(numKung / 2);
                numLu = Math.round(numLu / 2);
                if (numKung == numLu) {
                    fase = "semifinal";
                } else {
                    fase = "final";
                }
            }
        }
        return fase;
    }

    public static float lerNumFloat() {
        float valor = 0;
        do {
            valor = Sc.nextFloat();
        } while (valor < 1 || valor > 16);
        return valor;
    }
}
