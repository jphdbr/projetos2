class livro{
    private String autor;
    private String titulo;
    public livro(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }
    public void mostrardados(){
        System.out.println("autor: " + autor + ", titulo: " + titulo);
    }
}
public class Classeexercicioconcreta1 {
    public static void main(String[] args){
        livro l = new livro("Ana","nas mãos de maria");
        l.mostrardados();
    }
}