class produto{
    private String nome;
    private int preco;
    public produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }
    public void  exibirpreco(){
        System.out.println("nome: " + nome + ", preco: " + preco);
    }
}
public class Classeexercicioconcreta5 {
    public static void main(String[] args){
        produto p = new produto("shampoo", 12);
        p.exibirpreco();
    }
}