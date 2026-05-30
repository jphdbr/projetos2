package exemplosjava;

public class exemplo19 {
    public static void main(String[] args) {
        boolean impar = false;
        while (impar == false) {
            System.out.print("entre com um valor para x: ");
            int x = new java.util.Scanner(System.in).nextInt();
            if (x % 2 == 0) {
                System.out.println("e par");
            }else{
                impar = true;
                System.out.println("e impar");
            }
        }
    }

}
