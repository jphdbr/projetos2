public class Destrutores {
    protected  void finalze(){
        System.out.println("Objeto está sendo removido pelo Garbage collector");
    }

    static void main(String[] args) {
        Destrutores exemplo = new Destrutores();
        exemplo = null; // torno objeto disponível para remoção
        System.gc(); // sugere execução do Garbage Collector
    }
}
