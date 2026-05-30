import java.util.Scanner;

public class desafio1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int data;
            System.out.print("Digite a data (ddmmaaaa): ");
            data = sc.nextInt();

            int dia = data / 1000000;
            int mes = (data / 10000) % 100;
            int ano = data % 10000;

            int dias = 0;

            // Contar dias desde 01/01/1990
            for (int a = 1990; a < ano; a++) {
                dias += (isBissexto(a)) ? 366 : 365;
            }

            int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

            if (isBissexto(ano)) {
                diasMes[1] = 29;
            }

            for (int m = 1; m < mes; m++) {
                dias += diasMes[m - 1];
            }

            dias += (dia - 1);

            String[] semana = {
                    "segunda-feira", "terça-feira", "quarta-feira",
                    "quinta-feira", "sexta-feira", "sábado", "domingo"
            };

            int indice = dias % 7;

            System.out.println("Dia da semana: " + semana[indice]);


        }

        public static boolean isBissexto(int ano) {
            return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        }
    }

