package poo_atividades;

import java.util.ArrayList;
import java.util.List;

public class Pais extends Continente {
    private Continente continente;
    private List<Estado> estados = new ArrayList<>();
    private static List<Lei> leis = new ArrayList<>();

    public Pais(String nome, long id, Continente continente) {
        super(nome, id);
        this.continente = continente;
    }

    public Pais(String nome, long id) {
        super(nome, id);
    }

    public Pais() {
    }

    @Override
    public void mostrarDados(){
        System.out.println("País: " + this.getNome());
        System.out.println("Id: " + getId());
        System.out.println("Numero de Estados " + this.estados.size());
    }

    public void mostrarEstados() {
        for (Estado estado : estados) {
            System.out.println(estado.getNome());
        }
    }

    public void adicionarEstado(Estado estado) {
        estados.add(estado);
    }

    public void removerEstado(Estado estado) {
        estados.remove(estado);
    }

    public void mostrarLeis() {
        for (Lei lei : leis) {
            System.out.println(lei.getNomeDalei());
        }
    }

    @Override
    public void criarLei(String nomeDaLei, Pais pais) {
        Lei lei = new Lei(nomeDaLei, pais);
        leis.add(lei);
    }

    public void removerLeis(Lei lei) {leis.remove(lei);}

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }
}
