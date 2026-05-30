import java.util.Scanner;

public class exercicio6 {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Ponto 1 - Digite x1 e y1:");
            double x1 = leitor.nextDouble();
            double y1 = leitor.nextDouble();

            System.out.println("Ponto 2 - Digite x2 e y2:");
            double x2 = leitor.nextDouble();
            double y2 = leitor.nextDouble();
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("A distância entre os pontos é: " + distancia);
        }
    }

