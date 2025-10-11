import heranca.Animal;
import heranca.Passaro;

public class Main {
    public static void main(String[] args) {
        Food f1 = new Food("Spaghetti", "Macarrão com almondegas", new String[]{"Macarrão", "Almondegas"});
        f1.printFood();

        Animal sabia = new Passaro("Sabiá", 2);
        sabia.mostrarDados();
        sabia.fazerSom();


    }
}
