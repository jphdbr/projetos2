class Forma {
    public void desenhar() {
        System.out.println("Desenho genérico.");
    }
}

class Circulo extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

class Quadrado extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado.");
    }
}


 public class exercicio8p2 {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();

        c.desenhar();
        q.desenhar();
    }
}