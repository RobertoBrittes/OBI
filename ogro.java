import java.util.Scanner;

public class ogro {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int resultado = 0;
        int qtdDedosE = 0;
        int qtdDedosD = 0;

        do {
            qtdDedosE = lerNumInt();
            qtdDedosD = lerNumInt();
        } while (qtdDedosD == qtdDedosE);

        resultado = resultadoBrincadeira(qtdDedosE, qtdDedosD);
        
        System.out.println(resultado);
    }

    public static int lerNumInt() {
        int valorInt = 0;
        do {
            valorInt = Sc.nextInt();
        } while (valorInt < 0 || valorInt > 5);
        return valorInt;
    }

    public static int resultadoBrincadeira(int qtdDedosE, int qtdDedosD) {
        int resultado = 0;
        if (qtdDedosE > qtdDedosD ) {
            resultado = qtdDedosD + qtdDedosE;
        } else {
            resultado = 2*(qtdDedosD - qtdDedosE);
        }
        return resultado;
    }
}
