class Jogo {
    private String nomeJogo;

    public Jogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    class Jogador {
        private String nomeJogador;

        public Jogador(String nomeJogador) {
            this.nomeJogador = nomeJogador;
        }

        public void mostrarDados() {
            System.out.println("Jogo: " + nomeJogo);
            System.out.println("Jogador: " + nomeJogador);
        }
    }
}

public class Classeexerciciointerna5 {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("basquete");
        Jogo.Jogador jogador = jogo.new Jogador("Gui Santos");

        jogador.mostrarDados();
    }
}
