package heranca;

public class Animal {
    private String nome;
    private int idade;
    private String somDoAnimal = "Som de animal";

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome + "\nidade: " + this.idade);
    }

    public void fazerSom(){
        System.out.println(somDoAnimal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSomDoAnimal() {
        return somDoAnimal;
    }

    public void setSomDoAnimal(String somDoAnimal) {
        this.somDoAnimal = somDoAnimal;
    }
}
