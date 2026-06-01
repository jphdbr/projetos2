enum NivelAcesso {
    ADMIN,
    GERENTE,
    USUARIO
}

public class ClasseexercicioEnum2 {
    public static void main(String[] args) {

        NivelAcesso nivel = NivelAcesso.ADMIN;

        System.out.println("Nível de acesso: " + nivel);
    }
}
