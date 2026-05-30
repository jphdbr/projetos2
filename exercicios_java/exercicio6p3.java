public class exercicio6p3 {
    private String tipo;
    private String som;

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getSom() { return som; }
    public void setsom(String nome) { this.som = nome; }

    public static void main(String[] args) {
        exercicio6p3 an = new exercicio6p3();
        an.setTipo("mamifero");
        an.setsom("au au au");
        System.out.println("Tipo: " + an.getTipo());
        System.out.println("Som: " + an.getSom());
    }
}
