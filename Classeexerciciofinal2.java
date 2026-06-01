import org.w3c.dom.ls.LSOutput;

final class constantesApp{
    private String nomesistema = "instagram";
    public void mostrarNomesistema(){
        System.out.println("Nome do sistema: " + nomesistema);
    }
}
public class Classeexerciciofinal2 {
    public static void main(String[] args) {
        constantesApp app = new constantesApp();
        app.mostrarNomesistema();
    }
}
