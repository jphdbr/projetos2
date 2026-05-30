public class exercicio7p4 {
    public static void main(String[] args) {
        int numero = 8;
        boolean resultado = ehpar(numero);
        System.out.println("o numero " + numero + " é par? " + resultado);
    }
    public static boolean ehpar(int numero){
        return numero % 2 == 0;
    }
}
