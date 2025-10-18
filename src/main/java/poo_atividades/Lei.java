package poo_atividades;

public class Lei {
    private String nomeDalei;
    private Pais pais;

    public Lei(String nomeDalei, Pais pais) {
        this.nomeDalei = nomeDalei;
        this.pais = pais;
    }

    public Lei (String nomeDalei) {
        this.nomeDalei = nomeDalei;
    }

    public String getNomeDalei() {
        return nomeDalei;
    }

    public void setNomeDalei(String nomeDalei) {
        this.nomeDalei = nomeDalei;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
