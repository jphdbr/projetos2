class pessoa {
}

public class Classeexercicioanonima3 {
    public static void main(String[] args) {

        pessoa p = new pessoa() {
            @Override
            public String toString() {
                return "Objeto Pessoa criado com classe anônima";
            }
        };

        System.out.println(p);
    }
}
