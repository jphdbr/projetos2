class EmpresaTI {

    static class Setor {
        private String nome;

        public Setor(String nome) {
            this.nome = nome;
        }

        public void mostrar() {
            System.out.println("Setor: " + nome);
        }
    }
}

public class Classeexercicioestatica3 {
    public static void main(String[] args) {

        EmpresaTI.Setor setor =
                new EmpresaTI.Setor("Suporte Técnico");

        setor.mostrar();
    }
}
