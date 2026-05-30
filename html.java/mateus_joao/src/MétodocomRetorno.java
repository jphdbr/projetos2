public class MétodocomRetorno {
    public String nomeAluno() {
        return "Maria Silva";
    }

    static void main(String[] args) {
        MétodocomRetorno aluno = new MétodocomRetorno();
        System.out.println("Nome do aluno: "  + aluno.nomeAluno());
    }
}
