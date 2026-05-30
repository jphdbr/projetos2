package exemplosjava;

public class exemplo11 {
    public static void main(String[] args) {
        System.out.println("entre com um valor para x");
        int x = new java.util.Scanner((System.in)).nextInt();
        if (x >= 1 && x <= 1000) {
            System.out.println("o numero esta compreendido entrew 1 e 1000");
        }else {
            System.out.println("o numero nao esta compreendido entre 1 e 1000");
        }
    }
}
