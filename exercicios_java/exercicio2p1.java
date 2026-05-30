public class exercicio2p1 {
    public String nome(){
        var nome=new java.util.Scanner(System.in).nextLine();
        return nome;
    }

    static void main(String[] args) {
        exercicio2p1 e = new exercicio2p1();
        System.out.println( e.nome());
    }
}
