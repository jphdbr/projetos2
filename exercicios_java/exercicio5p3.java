public class exercicio5p3 {
   public static void main(String[] args) {
       System.out.println("soma 2: " + somar(10, 20));
       System.out.println("soma 3: " + somar(10, 20, 30));
       System.out.println("soma 4: " + somar(10, 20, 30, 40));
   }
   public static int somar(int a, int b){
       return a + b;
   }
   public static int somar(int a, int b, int c){
       return a + b + c;
   }
   public static int somar(int a, int b, int c, int d){
       return a + b + c + d;
   }
}
