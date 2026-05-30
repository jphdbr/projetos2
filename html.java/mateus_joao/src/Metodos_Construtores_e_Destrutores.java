public class Metodos_Construtores_e_Destrutores {
    String nome;

    //Metodo construtor
    public Metodos_Construtores_e_Destrutores(String nome){
        this.nome = nome;
    }
    public void exibirAluno(){
        System.out.println("Aluna: " + nome);
    }

    static void main(String[] args) {
        Metodos_Construtores_e_Destrutores aluno = new Metodos_Construtores_e_Destrutores("Caio");
        aluno.exibirAluno();
    }
}
