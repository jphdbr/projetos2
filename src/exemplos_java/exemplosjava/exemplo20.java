package exemplosjava;

import java.util.Scanner;

public class exemplo20 {
    public static void main(String[] args) {
        while(true){
            System.out.print("digite um valor para x: ");
            int x = new java.util.Scanner(System.in).nextInt();
            if (x % 2 == 0) {
                System.out.println(" e par");
            }else {
                System.out.println(" e impar");
           ;
            }

        }
    }
}
