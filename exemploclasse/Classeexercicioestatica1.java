class universidade{
    static class curso{
        private String nome;
        public curso(String nome){
            this.nome = nome;
        }
        public void mostrar(){
            System.out.println("curso: " + this.nome);
        }
    }
}
public class Classeexercicioestatica1  {
    public static void main(String[] args) {
        universidade.curso curso = new universidade.curso("desinvolvimento de sistemas");
        curso.mostrar();
    }
}

