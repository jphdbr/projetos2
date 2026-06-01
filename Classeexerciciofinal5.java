import java.time.LocalTime;
final class relogiosistema {
public void mostrarhora(){
    LocalTime horaatual = LocalTime.now();
    System.out.println("hora atual: " + horaatual);
}
}
public class Classeexerciciofinal5 {
    public static void main(String[] args) {
        relogiosistema relog = new relogiosistema();
        relog.mostrarhora();
    }
}
