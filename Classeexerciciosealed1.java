public class Classeexerciciosealed1 {

    public static void main(String[] args) {

        Forma1 forma1 = new Circulo1();
        Forma1 forma2 = new Quadrado1();

        System.out.println("Objetos criados com sucesso!");
    }
}

sealed class Forma1 permits Circulo1, Quadrado1 {
}

final class Circulo1 extends Forma1 {
}

final class Quadrado1 extends Forma1 {
}