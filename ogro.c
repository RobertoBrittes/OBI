#include <stdio.h>

int main() {
    int resultado = 0;
    int qtdDedosE = 0;
    int qtdDedosD = 0;

    scanf("%d", qtdDedosE);
    scanf("%d", qtdDedosE);

    resultado = resultadoBrincadeira(qtdDedosE, qtdDedosD);

    printf("%d", resultado);
}

int resultadoBrincadeira(int qtdDedosE, int qtdDedosD) {
    int resultado = 0;
    if (qtdDedosE > qtdDedosD)
    {
        resultado = qtdDedosD + qtdDedosE;
    }
    else
    {
        resultado = 2 * (qtdDedosD - qtdDedosE);
    }
    return resultado;
}