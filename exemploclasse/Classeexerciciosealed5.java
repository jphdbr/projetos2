public class Classeexerciciosealed5 {
    public static void main(String[] args) {

        Dispositivo1 dispositivo1 = new Notebook1();
        Dispositivo1 dispositivo2 = new Tablet1();

        System.out.println("Dispositivos criados com sucesso!");
    }
}

sealed class Dispositivo1 permits Notebook1, Tablet1 {
}

final class Notebook1 extends Dispositivo1 {
}

final class Tablet1 extends Dispositivo1 {
}
