enum StatusTarefa {
    PENDENTE,
    EM_ANDAMENTO,
    CONCLUIDA
}

public class ClasseexercicioEnum3 {
    public static void main(String[] args) {

        StatusTarefa status = StatusTarefa.EM_ANDAMENTO;

        System.out.println("Status: " + status);
    }
}
