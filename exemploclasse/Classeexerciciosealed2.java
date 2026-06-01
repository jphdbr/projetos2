public class Classeexerciciosealed2 {
    public static void main(String[] args) {

        Conta1 conta1 = new ContaCorrente1();
        Conta1 conta2 = new ContaPoupanca1();

        System.out.println("Contas criadas com sucesso!");
    }
}

sealed class Conta1 permits ContaCorrente1, ContaPoupanca1 {
}

final class ContaCorrente1 extends Conta1 {
}

final class ContaPoupanca1 extends Conta1 {
}