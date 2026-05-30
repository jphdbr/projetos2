package exemplosjava;

public class exemplo23 {
public static void main(String[] args) {
    int quantidadeNumerosprimos = 0;
    for (int i = 2; i <= 10; i++) {
        System.out.print(i + "e primo ");
        int numeroDivisores = 0;
        int j = 1;
        while (j <= i) {
            if (i % j == 0) {
                numeroDivisores++;

            }
            j++;

        }
        if (numeroDivisores == 2) {
            quantidadeNumerosprimos++;
            System.out.println("..sim");

        } else  {
            System.out.println("..nao");
        }
    }
    System.out.println("quantidade de numeros primos: " + quantidadeNumerosprimos);
}
}


