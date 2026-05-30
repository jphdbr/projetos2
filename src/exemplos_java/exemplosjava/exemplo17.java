package exemplosjava;

public class exemplo17 {
    public static void main(String[] args) {
        System.out.print("entre com a opção desejada !");
        System.out.println("1 - pratos");
        System.out.println("2 - bebidas");
        System.out.println("3 - encerre sua conta");
        int opcao = new java.util.Scanner(System.in).nextInt();
        switch (opcao){
            case 1: {
                System.out.println("* hamburger artesanal");
                System.out.println("* pizza a moda da casa");
                System.out.println("* batata empanada");
                break;
            }
            case 2: {
                System.out.println("* agua");
                System.out.println("* refrigerante");
                System.out.println("* cerveja");
                break;
            }
            case 3: {
                System.out.println("* conta encerrada");
                break;
            }
            default: {
                System.out.println("opcao invalida ");
            }
        }
    }
}
