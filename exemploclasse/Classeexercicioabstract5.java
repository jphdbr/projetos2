abstract class transporte{
    public abstract void mover();
}
class van extends transporte{
    @Override
    public void mover() {
        System.out.println("veiculo esta se movendo para cotia.");
    }
}
public class Classeexercicioabstract5 {
    public static void main(String[] args) {
        transporte transporte = new van();
        transporte.mover();
    }
}
