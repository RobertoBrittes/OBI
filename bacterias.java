import java.util.Scanner;

public class bacterias {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdDiasMax = 0;
        int capacidade = lerNumInt();
        int fator = lerNumInt();

        qtdDiasMax = verificarQtdDias(capacidade, fator);

        System.out.println(qtdDiasMax);
    }

    public static int verificarQtdDias(int capacidade, int fator) {
        int qtdDiasMax = 0;
        int bacterias = 1;
        while (true) {
            bacterias *= fator;
            if (bacterias > capacidade) {
                break;
            }
            qtdDiasMax++;
        }
        return qtdDiasMax;
    }

    public static int lerNumInt() {
        return Sc.nextInt();
    }
}
