public class MétodoscomParâmetros {
    public void imprimirNome(String nome){
        System.out.println("Nome recebido: " + nome);
    }

    static void main(String[] args) {
        MétodoscomParâmetros imp = new MétodoscomParâmetros();
        imp.imprimirNome("Mateus");
    }
}
