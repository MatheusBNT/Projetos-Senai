package poo_atividades;

import java.util.ArrayList;
import java.util.List;

public class Continente{
    private long id;
    private String nome;
    private List<Pais> paises = new ArrayList<>();

    public Continente() {
    }

    public Continente(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public Continente(String nome) {
        this.nome = nome;
    }

    public void mostrarPaises(){
        for(Pais p : paises){
            System.out.println(p.getNome());
        }
    }

    public void adicionarPais(Pais p){
        paises.add(p);
    }

    public void removerPais(Pais p){
        paises.remove(p);
    }

    public void criarLei(String nome, Pais pais) {

    }

    public void mostrarDados(){
        System.out.println("Nome do continente: " + nome);
        System.out.println("Id do continente: " + id);
        System.out.println("numero de países: " + paises.size());
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }
}
