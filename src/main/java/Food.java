import java.util.Arrays;

public class Food {
    private String nome;
    private String descricao;
    private String[] ingredientes;

    public Food() {
    }

    public Food(String nome, String descricao, String[] ingredientes) {
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
    }

   public void printFood(){
       System.out.println(""+this.nome + " - " + this.descricao);
       System.out.println("ingredientes: "+Arrays.toString(this.ingredientes));
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}
