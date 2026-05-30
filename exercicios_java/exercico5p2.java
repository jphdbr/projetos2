public class exercico5p2 {
    public static void main(String[] args) {
        exibir("Olá");
        exibir("Olá", 3);
    }
    public static void exibir(String texto){
        System.out.println(texto);
    }
    public static void exibir(String texto, int numero){
        for (int i = 0; i < 100; i++) {
            System.out.println(texto);
        }
    }
}
