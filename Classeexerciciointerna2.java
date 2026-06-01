class Escola {
    private String nomeEscola;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    class Turma {
        private String nomeTurma;

        public Turma(String nomeTurma) {
            this.nomeTurma = nomeTurma;
        }

        public void mostrarDados() {
            System.out.println("Escola: " + nomeEscola);
            System.out.println("Turma: " + nomeTurma);
        }
    }
}

public class Classeexerciciointerna2 {
    public static void main(String[] args) {
        Escola escola = new Escola("Etec Uirapuru");
        Escola.Turma turma = escola.new Turma("DS 2º Ano");

        turma.mostrarDados();
    }
}
