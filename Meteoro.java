import java.util.Scanner;

public class Meteoro {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int coordX1;
        int coordY1;
        int coordX2;
        int coordY2;
        int numMeteoritos;
        int i = 0;
        int numTeste = 0;

        while (true) {
            coordX1 = lerNumInt();
            coordY1 = lerNumInt();
            coordX2 = lerNumInt();
            coordY2 = lerNumInt();
            if (coordX1 == 0 && coordX2 == 0 && coordY1 == 0 && coordY2 == 0) {
                break;
            }
            numMeteoritos = lerNumInt();
            numTeste++;
            verificarMeteorito(coordX1, coordX2, coordY1, coordY2, i, numMeteoritos, numTeste);
        }

    }
    public static int lerNumInt() {
        int valor;
        do {
            valor = LER.nextInt();
        } while (valor < 0 || valor > 10000);
        return valor;
    }
    public static void verificarMeteorito (int coordX1, int coordX2, int coordY1, int coordY2, int i, int numMeteoritos, int numTeste) {
        int meteoritosDentro = 0;
        int coordXMeteorito;
        int coordYMeteorito;
        
        while (i < numMeteoritos) {
            i++;
            coordXMeteorito = lerNumInt();
            coordYMeteorito = lerNumInt();
            if (coordXMeteorito >= coordX1 && coordXMeteorito <= coordX2) {
                if (coordYMeteorito <= coordY1 && coordYMeteorito >= coordY2) {
                    meteoritosDentro++;
                }
            }
        }
        imprimir("Teste " + numTeste);
        imprimir("" + meteoritosDentro);
    }

    public static void imprimir(String string){
        System.out.println(string);
    }
}
