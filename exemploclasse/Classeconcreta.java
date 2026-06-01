        class Pessoa {
        private String nome;
        private int idade;
        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }
        public void apresentar() {
            System.out.println("Nome: " + nome + ", Idade: " + idade);
        }
    }
    public class Classeconcreta {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Ana", 17);
        p.apresentar();
    }
}

