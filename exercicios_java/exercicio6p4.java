public class exercicio6p4 {
    private double saldo;
    private String titular;

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}

    public static void main(String[] args) {
        exercicio6p4 bc = new exercicio6p4();
        bc.setSaldo(20);
        bc.setTitular("Jorge");
        System.out.println("Saldo: " + bc.getSaldo() + " R$");
        System.out.println("Titular: " + bc.getTitular());
    }
}
