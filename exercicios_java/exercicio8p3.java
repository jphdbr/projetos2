class Funcionario {
    public void trabalhar() { System.out.println("Funcionário trabalhando."); }
}

class Professor extends Funcionario {
    @Override
    public void trabalhar() { System.out.println("Professor ensinando Java."); }
}

public class exercicio8p3 {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.trabalhar();
    }
}
