class carro{
    private String marca;
    private String modelo;
    public carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void exibir(){
        System.out.println("marca: " + marca + ", modelo: " + modelo);
    }
}
public class Classeexercicioconcreta3 {
    public static void main(String[] args){
        carro c = new carro("chevrolet", "1996");
        c.exibir();
    }
}
