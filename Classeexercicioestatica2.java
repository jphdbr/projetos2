class Sistema {

    static class Log {
        public void registrar() {
            System.out.println("Login registrado com sucesso!");
        }
    }
}

public class Classeexercicioestatica2 {
    public static void main(String[] args) {

        Sistema.Log log = new Sistema.Log();

        log.registrar();
    }
}
