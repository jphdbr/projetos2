interface Impressao {
    void imprimir();
}

public class Classeexercicioanonima {
    public static void main(String[] args) {

        Impressao imp = new Impressao() {
            @Override
            public void imprimir() {
                System.out.println("Documento impresso!");
            }
        };

        imp.imprimir();
    }
}
