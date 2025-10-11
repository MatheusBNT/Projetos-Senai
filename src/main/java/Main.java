public class Main {
    public static void main(String[] args) {
        Food f1 = new Food("Spaghetti", "Macarrão com almondegas", new String[]{"Macarrão", "Almondegas"});
        Food f2 = new Food();
        f2.setNome("Miojo");
        f2.setDescricao("Macarrão instantaneo");
        f2.setIngredientes(new String[]{"Miojo", "agua"});
        f1.printFood();
        f2.printFood();
    }
}
