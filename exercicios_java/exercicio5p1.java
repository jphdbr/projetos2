public class exercicio5p1 {
    public static void main(String[] args) {
        System.out.println("Àrea quadrado: " + calcularArea(5));
        System.out.println("Àrea retângulo: " + calcularArea(5, 10));
    }
    public static int calcularArea(int lado){
        return lado * lado;
    }
    public static int calcularArea(int base, int altura){
        return base * altura;
    }
}
