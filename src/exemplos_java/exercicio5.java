import java.util.Scanner;

public class exercicio5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Velocidade média (km/h): ");
            double velocidade = sc.nextDouble();

            System.out.print("Tempo gasto (horas): ");
            double tempo = sc.nextDouble();

            double distancia = velocidade * tempo;
            System.out.println("Distância percorrida: " + distancia + " km");
        }
    }

