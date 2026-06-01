final class Configuraçõesdosistema{
    private String versao = "v2.5.4";
    public void mostrarversão(){
        System.out.println("A versão atual é: " + versao);
    }
}
public class Classeexerciciofinal1 {
    public static void main(String[] args) {
        Configuraçõesdosistema config = new Configuraçõesdosistema();
        config.mostrarversão();
    }
}
