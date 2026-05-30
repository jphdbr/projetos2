public class exercicio6p1 {
    private String nome;
    private  double preco;

    public String getNome() {return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() {return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public static void main(String[] args) {
        exercicio6p1 p = new exercicio6p1();
        p.setNome("macarrão");
        p.setPreco(10);
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preco: " + p.getPreco() + " R$");
    }
}
