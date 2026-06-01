class aluno{
    private String nome;
    private int nota;
    public aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }
    public void mostrarresultado(){
        System.out.println("nome: " + nome + ", nota: " + nota);
    }
}
public class Classeexercicioconcreta4 {
    public static void main(String[] args){
        aluno a = new aluno("Ana", 10);
        a.mostrarresultado();
    }
}