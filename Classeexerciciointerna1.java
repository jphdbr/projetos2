class casa{
    private String endereco;
    public casa(String endereco){
        this.endereco = endereco;
    }
    class quarto{
        private String nome;
        public quarto(String nome){
            this.nome = nome;
        }
        public void mostardados(){
            System.out.println("endereço da casa: " + endereco);
            System.out.println("quarto: " + nome);
        }
    }
}
public class Classeexerciciointerna1 {
    public static void main(String[] args) {
        casa casa = new casa("Rua A, 123");
        casa.quarto quarto =  casa.new quarto("quarto principal");
        quarto.mostardados();
    }
}
