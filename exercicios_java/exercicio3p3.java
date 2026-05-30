public class exercicio3p3 {

   public static void main(String[] args) {
       verificarNumero(100);
       verificarNumero(-55);
   }
   public static void verificarNumero(int numero){
       if(numero >= 0) {
           System.out.println(numero + " é positivo ou zero.");
       } else {
           System.out.println(numero + " é negativo.");
       }
   }
}
