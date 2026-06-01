class Aplicativo {

    static class Versao {
        private String numero;

        public Versao(String numero) {
            this.numero = numero;
        }

        public void mostrar() {
            System.out.println("Versão: " + numero);
        }
    }
}

public class Classeexercicioestatica5 {
    public static void main(String[] args) {

        Aplicativo.Versao versao =
                new Aplicativo.Versao("1.0.67");

        versao.mostrar();
    }
}
