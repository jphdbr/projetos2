class Biblioteca {

    static class Categoria {
        private String nome;

        public Categoria(String nome) {
            this.nome = nome;
        }

        public void mostrar() {
            System.out.println("Categoria: " + nome);
        }
    }
}

public class Classeexercicioestatica4 {
    public static void main(String[] args) {

        Biblioteca.Categoria categoria =
                new Biblioteca.Categoria("Teologia catolica.");

        categoria.mostrar();
    }
}
