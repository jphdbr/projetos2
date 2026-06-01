class omg {

    public void calcular() {

        class Calculadora {
            public int somar(int a, int b) {
                return a + b;
            }
        }

        Calculadora calc = new Calculadora();

        System.out.println("Soma = " + calc.somar(10, 5));
    }

    public static void main(String[] args) {
        omg obj = new omg();
        obj.calcular();
    }
}
