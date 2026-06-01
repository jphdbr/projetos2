abstract class funcionario{
    public abstract double calcularbonus();
}
class gerente extends funcionario{
    private double salariobase = 5000.0;
    @Override
    public double calcularbonus() {
        return salariobase * 0.20;
    }
}
class atendente extends funcionario{
    private double salariobase = 2000.0;
    @Override
    public double calcularbonus() {
        return 150.0;
    }
}
public class Classeexercicioabstrata4 {
    public static void main(String[] args) {
        gerente gerente = new gerente();
        atendente atendente = new atendente();
        System.out.println("bonus do Gerente: R$: " + gerente.calcularbonus());
        System.out.println("bonus do atendente: R$: " + atendente.calcularbonus());
    }
}