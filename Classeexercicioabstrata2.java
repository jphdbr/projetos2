abstract class  Pagamento{
    public abstract void processar();
}

class Conta extends Pagamento{
    @Override
    public void processar() {
        System.out.println("conta em processamento.");
    }
}
public class Classeexercicioabstrata2 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.processar();
    }
}