package exemplosjava;

public class exemplo22 {
    public static void main(String[] args) {
        System.out.println("digite um valor");
        int maior = new java.util.Scanner(System.in).nextInt();
        System.out.println("maior" + maior);
        for (int i = 0; i <= maior; i++) {
            System.out.println("digite um valor");
            int x = new java.util.Scanner(System.in).nextInt();
            if (x > maior){
                maior = x;
            }
            System.out.println("maior" + maior);
        }
    }
}
