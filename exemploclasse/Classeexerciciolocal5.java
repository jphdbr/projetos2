class hello {

    public void cumprimentar() {

        class Saudacao {
            public void dizerOla(String nome) {
                System.out.println("Olá, " + nome + "!");
            }
        }

        Saudacao saudacao = new Saudacao();
        saudacao.dizerOla("João");
    }

    public static void main(String[] args) {
        hello obj = new hello();
        obj.cumprimentar();
    }
}
