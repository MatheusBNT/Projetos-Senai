package heranca;

public class Passaro extends Animal{

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        super.setSomDoAnimal("Piu-Piu");
        super.fazerSom();
    }
}
