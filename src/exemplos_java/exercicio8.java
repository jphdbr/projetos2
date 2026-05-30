import java.util.Scanner;

public class exercicio8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a, b;

            System.out.print("Digite A: ");
            a = sc.nextInt();

            System.out.print("Digite B: ");
            b = sc.nextInt();

            int maior = (a > b) ? a : b;

            System.out.println("Maior: " + maior);

        }
    }

