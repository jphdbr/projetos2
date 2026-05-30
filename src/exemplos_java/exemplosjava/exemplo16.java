package exemplosjava;

public class exemplo16 { public static void main(String[] args) {
    System.out.println("entre com a opcao desejada!");
    System.out.println("1 - pratos");
    System.out.println("2 - bebidas");
    System.out.println("3 - encerre sua conta");
    int opcao = new java.util.Scanner(System.in).nextInt();
    if (opcao == 1){
        System.out.println("* hamburger");
        System.out.println("* pizza a moda da casa");
        System.out.println("* batata empanada");
    }else {
        if (opcao == 2){
            System.out.println("* agua");
            System.out.println("* refrigerante");
            System.out.println("* cerveja");
        }else {
            if (opcao == 3) {
                System.out.println("conta encerrada");
            }else {
            System.out.println("opcao invalida ");
            }
        }
    }
}
}
