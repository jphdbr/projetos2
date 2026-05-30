package exemplosjava;

public class exemplo14 { public static void main(String[] args) {

    System.out.println("entrecom um valor para x");
    int x = new java.util.Scanner(System.in).nextInt();
    System.out.println("entre com um valor para y");
    int y = new java.util.Scanner(System.in).nextInt();
    System.out.println("entre com um valor para z");
    int z = new java.util.Scanner(System.in).nextInt();
    if(x > y && x > z) {
        System.out.println("maior" + x);
    }else {
        if (y > x && y > z) {
            System.out.println("maior" + y);

        } else {
            System.out.println("maior"+z);
        }

    }
}
}
