record Produto(String nome, double preco) {
}

public class Classeexerciciorecord1 {
    public static void main(String[] args) {

        Produto p = new Produto("Notebook", 3500.00);

        System.out.println("Nome: " + p.nome());
        System.out.println("Preço: R$ " + p.preco());
    }
}