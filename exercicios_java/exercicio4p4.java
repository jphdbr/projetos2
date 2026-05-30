public class exercicio4p4 {
    public static void main(String[] args) {
        boolean maior = verificarIdade(16);
        System.out.println("é maior de idade? " + maior);
    }
    public static boolean verificarIdade(int idade) {
        return idade >= 18;
    }
}
