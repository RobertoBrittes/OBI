import java.util.Scanner;

public class Testes {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite se é aluno ou professor\n1-Aluno\n2-Professor");

        if (Sc.nextInt() == 1) {
            Aluno aluno1 = new Aluno(lerProxLinha(), lerProxLinha(), Sc.nextFloat(), Sc.nextFloat());
            System.out.printf("Nome: %s\nTurma: %s\nPeso: %.2fKg\nAltura: %.2fm\n",
                    aluno1.nome, aluno1.turma, aluno1.peso, aluno1.altura);
        } else {
            Professor professor1 = new Professor(lerProxLinha(), lerProxLinha(), Sc.nextFloat(), Sc.nextFloat());
            System.out.printf("Nome: %s\nFormação: %s\nPeso: %.2fKg\nAltura: %.2fm\n",
                    professor1.nome, professor1.formacao, professor1.peso, professor1.altura);
        }

    }

    private static class Aluno extends Pessoa {
        String turma;

        public Aluno(String nome, String turma, float peso, float altura) {
            this.nome = nome;
            this.turma = turma;
            this.peso = peso;
            this.altura = altura;
        }
    }

    private static class Professor extends Pessoa {
        String formacao;

        public Professor(String nome, String formacao, float peso, float altura) {
            this.nome = nome;
            this.formacao = formacao;
            this.peso = peso;
            this.altura = altura;
        }
    }

    private static class Pessoa {
        String nome;
        float peso, altura;
    }

    public static String lerProxLinha() {
        String str;
        do {
            str = Sc.nextLine();
        } while (str.length() == 0);
        return str;
    }
}