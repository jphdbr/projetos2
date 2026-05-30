public class exercicio8 {
        public void emitirSom() {
            System.out.println("O animal emite um som genérico.");
        }
    }

    class Cachorro extends exercicio8 {
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
        }

        public static void main(String[] args) {
            Cachorro meuDog = new Cachorro();
            meuDog.emitirSom();
        }
        }

