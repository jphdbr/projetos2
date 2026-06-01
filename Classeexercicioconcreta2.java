class conta{
    private String numero;
    private String saldo;

    public conta(String numero, String saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
     public void depositar(){
         System.out.println("numero: " + numero + ", saldo: " + saldo);
     }
}

public class Classeexercicioconcreta2 {
    public static void main(String[] args){
        conta c = new conta("5", "12R$");
        c.depositar();
    }
}
