class Loja {
    private String nomeLoja;

    public Loja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    class Caixa {
        private int numeroCaixa;

        public Caixa(int numeroCaixa) {
            this.numeroCaixa = numeroCaixa;
        }

        public void mostrarDados() {
            System.out.println("Loja: " + nomeLoja);
            System.out.println("Caixa nº: " + numeroCaixa);
        }
    }
}
public class Classeexerciciointerna4 {
    public static void main(String[] args) {
        Loja loja = new Loja("Centauro");
        Loja.Caixa caixa = loja.new Caixa(15);

        caixa.mostrarDados();
    }
}
