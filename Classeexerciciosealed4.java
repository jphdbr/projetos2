public class Classeexerciciosealed4 {
    public static void main(String[] args) {

        UsuarioSistema1 usuario1 = new Administrador1();
        UsuarioSistema1 usuario2 = new Cliente1();

        System.out.println("Usuários criados com sucesso!");
    }
}

sealed class UsuarioSistema1 permits Administrador1, Cliente1 {
}

final class Administrador1 extends UsuarioSistema1 {
}

final class Cliente1 extends UsuarioSistema1 {
}
