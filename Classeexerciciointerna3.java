class Banco {
    private String nomeBanco;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    class Agencia {
        private int numero;

        public Agencia(int numero) {
            this.numero = numero;
        }

        public void mostrarDados() {
            System.out.println("Banco: " + nomeBanco);
            System.out.println("Agência: " + numero);
        }
    }
}

public class Classeexerciciointerna3 {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco do Brasil");
        Banco.Agencia agencia = banco.new Agencia(6767);

        agencia.mostrarDados();
    }
}
