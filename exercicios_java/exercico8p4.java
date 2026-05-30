class Esporte {
    public void jogar() { System.out.println("Praticando um esporte."); }
}

class Futebol extends Esporte {
    @Override
    public void jogar() { System.out.println("Jogando futebol!"); }
}

class Basquete extends Esporte {
    @Override
    public void jogar() { System.out.println("Jogando basquete!"); }
}

public class exercico8p4 {
    public static void main(String[] args) {
        new Futebol().jogar();
        new Basquete().jogar();
    }
}
