class mensagem {

    public void exibirMensagem() {

        class Mensagem {
            public void mostrar() {
                System.out.println("Olá, seja bem-vindo!");
            }
        }

        Mensagem msg = new Mensagem();
        msg.mostrar();
    }

    public static void main(String[] args) {
        mensagem obj = new mensagem();
        obj.exibirMensagem();
    }
}
