public class MétodoscomRetornoeParametro {
    public int multiplicar(int x, int y){
        return x * y;
    }

    static void main(String[] args) {
        MétodoscomRetornoeParametro calc = new MétodoscomRetornoeParametro();
        int resultado = calc.multiplicar(4,5);
        System.out.println("resultado: " + resultado);

    }

}
