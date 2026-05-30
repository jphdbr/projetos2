public class exercicop2 {
    private String titulo;
    private String autor;

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public static void main(String[] args) {
        exercicop2 lv = new exercicop2();
        lv.setTitulo("As aventuras de Mike");
        lv.setAutor("Gabriel Dearo e Manuela Digilio");
        System.out.println("Titulo: " + lv.getTitulo());
        System.out.println("Autor: " + lv.getAutor());
    }
}
