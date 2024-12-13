import java.util.HashSet;
import java.util.Scanner;

public class Bee1609 {

    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdCasosTeste = Sc.nextInt();
        for (int i = 0; i < qtdCasosTeste; i++) {
            int qtdCarneirinhos = Sc.nextInt();
            HashSet<Integer>carneiros=new HashSet<>();
            for (int j = 0; j < qtdCarneirinhos; j++) {
                carneiros.add(Sc.nextInt());
            }
            System.out.println(carneiros.size());
        }

    }

}