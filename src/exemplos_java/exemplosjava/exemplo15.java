package exemplosjava;

public class exemplo15 {
    public static void main(String[] args) {
        System.out.println("entre com um valor para x:");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println(x % 2 == 0 ? "e par" : "impar");
    }
}

