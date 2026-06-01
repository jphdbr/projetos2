public class Classeexerciciosealed3 {
    public static void main(String[] args) {

        Midia1 midia1 = new LivroDigital1();
        Midia1 midia2 = new Video1();

        System.out.println("Mídias criadas com sucesso!");
    }
}

sealed class Midia1 permits LivroDigital1, Video1 {
}

final class LivroDigital1 extends Midia1 {
}

final class Video1 extends Midia1 {
}
