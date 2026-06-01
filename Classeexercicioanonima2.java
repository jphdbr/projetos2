interface Operacao {
    int calcular(int a, int b);
}

public class Classeexercicioanonima2 {
    public static void main(String[] args) {

        Operacao soma = new Operacao() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Resultado: " + soma.calcular(10, 5));
    }
}