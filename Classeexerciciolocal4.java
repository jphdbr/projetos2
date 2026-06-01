class verificador {

    public void verificarNumero() {

        class Validador {
            public boolean positivo(int numero) {
                return numero > 0;
            }
        }

        Validador validador = new Validador();

        int numero = 15;

        if (validador.positivo(numero)) {
            System.out.println(numero + " é positivo.");
        } else {
            System.out.println(numero + " não é positivo.");
        }
    }

    public static void main(String[] args) {
        verificador obj = new verificador();
        obj.verificarNumero();
    }
}
