public class exercicio8p1 {
        public void mover() {
            System.out.println("O transporte está se movendo.");
        }
    }

    class Carro extends exercicio8p1 {
        @Override
        public void mover() {
            System.out.println("O carro está em movimento.");
        }
        public  static void main(String[] args) {
            Carro car = new Carro();
            car.mover();
        }
    }

