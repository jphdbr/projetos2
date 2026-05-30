import java.util.Scanner;

public class exercicio12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            long fatorial = 1;

            System.out.print("Digite um número: ");
            n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial: " + fatorial);


        }
    }

