class mercado {

    public void mostrarEtiqueta() {

        class Etiqueta {
            private String titulo;

            public Etiqueta(String titulo) {
                this.titulo = titulo;
            }

            public void mostrar() {
                System.out.println("=== " + titulo + " ===");
            }
        }

        Etiqueta etiqueta = new Etiqueta("Produto Novo");
        etiqueta.mostrar();
    }

    public static void main(String[] args) {
        mercado obj = new mercado();
        obj.mostrarEtiqueta();
    }
}