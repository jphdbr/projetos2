abstract class Funcionario {
    protected String nome;
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public void mostrarNome() {
        System.out.println("Funcionario: " + nome);
    }
    public abstract double calcularSalario();
}
 class FuncionarioCLT extends Funcionario {
    private double salarioBase;
    public FuncionarioCLT(String nome, double salarioBase){
        super(nome);
        this.salarioBase = salarioBase;
    }

     @Override
     public double calcularSalario() {
         return salarioBase;
     }
 }
 public class Classeabstrata {
    public static void main(String[] args) {
        Funcionario f = new FuncionarioCLT("carlos", 3500.0);
        f.mostrarNome();
        System.out.println("salario: R$ " + f.calcularSalario());
    }
}
