interface Alarme {
    void tocar();
}

public class Classeexercicioanonima4 {
    public static void main(String[] args) {

        Alarme alarme = new Alarme() {
            @Override
            public void tocar() {
                System.out.println("Alarme disparado!");
            }
        };

        alarme.tocar();
    }
}
