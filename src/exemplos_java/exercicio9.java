import java.util.Scanner;

public class exercicio9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a, b, c;

            System.out.print("Lado A: ");
            a = sc.nextInt();

            System.out.print("Lado B: ");
            b = sc.nextInt();

            System.out.print("Lado C: ");
            c = sc.nextInt();

            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }

    }

