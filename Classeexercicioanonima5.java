public class Classeexercicioanonima5 {
    public static void main(String[] args) {

        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando tarefa...");
            }
        };

        tarefa.run();
    }
}
