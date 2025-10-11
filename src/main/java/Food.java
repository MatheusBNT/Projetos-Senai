import java.util.Arrays;

public class Food {
    private String nome;
    private String descricao;
    private String[] ingredientes;

    public Food(String nome, String descricao, String[] ingredientes) {
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
    }

   public void printFood(){
       System.out.println(""+this.nome + " - " + this.descricao);
       System.out.println("ingredientes: "+Arrays.toString(this.ingredientes));
   }


}
