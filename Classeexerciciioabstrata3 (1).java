sealed class Forma permits Circulo, Quadrado {
}

final class Circulo extends Forma {
}

final class Quadrado extends Forma {
}

public class Classeexerciciioabstrata3 {
    public static void main(String[] args) {

        Circulo c = new Circulo();
        Quadrado q = new Quadrado();

        System.out.println("Objetos criados com sucesso!");
    }
}