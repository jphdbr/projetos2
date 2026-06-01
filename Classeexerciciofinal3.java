final class validadorCPF{
    private String cpf = "500-390-408-21";
    public void validar(){
        System.out.println("o CPF q sera validado é: " + cpf );
    }
}
public class Classeexerciciofinal3 {
    public static void main(String[] args) {
        validadorCPF cpf = new validadorCPF();
        cpf.validar();
    }
}
