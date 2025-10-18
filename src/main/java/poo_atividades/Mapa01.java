package poo_atividades;

public class Mapa01 {

    Continente continente = new Continente("South America", 1);


    {
        Pais pais01 = new Pais("Brasil", 1);
        Pais pais02 = new Pais("Argentina", 2);
        Pais pais03 = new Pais("Uruguai", 3);
        Pais pais04 = new Pais("Chile", 4);
        Pais pais05 = new Pais("Colômbia", 5);
        Pais pais06 = new Pais("Equador", 6);
        Pais pais07 = new Pais("Bolívia", 7);
        Pais pais08 = new Pais("Guiana", 8);
        Pais pais09 = new Pais("Paraguai", 9);
        Pais pais10 = new Pais("Peru", 10);
        Pais pais11 = new Pais("Suriname", 11);
        Pais pais12 = new Pais("Venezuela", 12);
        continente.adicionarPais(pais01);
        continente.adicionarPais(pais02);
        continente.adicionarPais(pais03);
        continente.adicionarPais(pais04);
        continente.adicionarPais(pais05);
        continente.adicionarPais(pais06);
        continente.adicionarPais(pais07);
        continente.adicionarPais(pais08);
        continente.adicionarPais(pais09);
        continente.adicionarPais(pais10);
        continente.adicionarPais(pais11);
        continente.adicionarPais(pais12);
    }

    public void carregarAmericaDoSul() {
        continente.mostrarDados();
        continente.mostrarPaises();
    }
}
