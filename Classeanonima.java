interface Saudacao{
    void mostrarMensagem();
}
public class Classeanonima {
    public static void main(String[] args) {
        Saudacao s = new Saudacao() {
            @Override
            public void mostrarMensagem() {
                System.out.println("Olá! Esta mensagem vem de uma classe anônima.");

            }
        };
        s.mostrarMensagem();
    }
}