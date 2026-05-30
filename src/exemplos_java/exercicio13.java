import java.util.Scanner;

public class exercicio13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x, y;
            int resultado = 1;

            System.out.print("Base: ");
            x = sc.nextInt();
            System.out.print("Expoente: ");
            y = sc.nextInt();

            for (int i = 0; i < y; i++) {
                resultado *= x;
            }
            System.out.println("Resultado: " + resultado);
    }
}
