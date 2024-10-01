import java.util.Scanner;

public class MacacoPrego {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int coordX;
        int coordY;
        int coordU;
        int coordV;
        int numTeste = 0;
        int i = 0;
        int qtdRetangulos;

        while (true) {
            do {
                qtdRetangulos = lerNumInt();
            } while (qtdRetangulos < 0);

            if (qtdRetangulos == 0) {
                break;
            }
            if (qtdRetangulos == 0) {
                break;
            }
            numTeste++;
            verificarInterseccao(qtdRetangulos, numTeste);
        }
    }

    public static void verificarInterseccao(int qtdRetangulos, int numTeste) {
        int coordX = 0;
        int coordY = 0;
        int coordU = 0;
        int coordV = 0;
        int interseccaoX = -10000;
        int interseccaoY = 10000;
        int interseccaoU = 10000;
        int interseccaoV = -10000;

        for (int i = 0; i < qtdRetangulos; i++) {
            coordX = lerNumInt();
            coordY = lerNumInt();
            coordU = lerNumInt();
            coordV = lerNumInt();

            interseccaoX = Math.max(interseccaoX, coordX);
            interseccaoU = Math.min(interseccaoU, coordU);
            interseccaoY = Math.min(interseccaoY, coordY);
            interseccaoV = Math.max(interseccaoV, coordV);
        }
        imprimir("Teste " + numTeste);
        if (interseccaoX < interseccaoU && interseccaoY > interseccaoV) {
            imprimir(interseccaoX + " " + interseccaoY + " " + interseccaoU + " " + interseccaoV);
        } else {
            imprimir("nenhum");
        }
        imprimir("");
    }

    public static int lerNumInt() {
        int valor;
        do {
            valor = LER.nextInt();
        } while (valor < -10000 && valor > 10000);
        return valor;
    }

    public static void imprimir(String string) {
        System.out.println(string);
    }
}