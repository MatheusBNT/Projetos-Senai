package heranca;

public class Passaro extends Animal{
    private final String som = "Piu-Piu";

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(som);
    }
}
