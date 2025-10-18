package poo_atividades;

import java.util.ArrayList;
import java.util.List;

public class Estado extends Pais{
    private Pais pais;
    private List<Lei> leis = new ArrayList<>();

    public Estado(String nome, long id, Pais pais) {
        super(nome, id);
        this.pais = pais;
    }

    public Estado() {
    }
}
