class Empresa{
    static class Departamento {
        private String nome;
        public Departamento(String nome){
            this.nome = nome;
        }
        public void mostrar() {
            System.out.println("Departamento: " + nome);
        }
    }
}
public class Classeaninhadaestatica {
    public static void main(String[] args) {
        Empresa.Departamento d = new Empresa.Departamento("Financeiro");
        d.mostrar();
    }
}