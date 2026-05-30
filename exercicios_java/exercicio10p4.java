class MinhaClasse {
    public void saudacao() {
        System.out.println("Olá! Este método foi chamado por um objeto.");
    }
}

// Classe com o método main
public class exercicio10p4 extends MinhaClasse {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse(); // I
        obj.saudacao();
    }
}
