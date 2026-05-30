public class exercicio6 {
    private String nome;
    private int idade;

    public String getNome() {return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() {return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public static void main(String[] args) {
        exercicio6 ex = new exercicio6();
        ex.setNome( "João Pedro");
        ex.setIdade(16);
        System.out.println("Nome: " + ex.getNome());
        System.out.println("Idade: " + ex.getIdade());
    }
}
