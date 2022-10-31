package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.Internacoes;
import br.com.ada.petshop.modelo.Cachorro;
import br.com.ada.petshop.modelo.Dono;
import br.com.ada.petshop.modelo.Endereco;

public class TestPetShop {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Zodiaco", "227", "06528075", "Jardins", "SP");
        Endereco endereco2 = new Endereco("Alfeu de Oliveira", "353", "87943923", "Fazendinha", "SP");
        Endereco endereco3 = new Endereco("Tico-Tico", "21", "3223342", "Laranjas", "SP");

        Dono Jessica = new Dono("Jessica", endereco1);
        Dono Franklin = new Dono("Franklin", endereco2);
        Dono Jessiany = new Dono("Jessiany", endereco3);

        Cachorro cachorro1 = new Cachorro(Jessica);
        cachorro1.setNome("Totó");
        cachorro1.setRaca("Poodle");
        cachorro1.setIdade(7);
        cachorro1.setEstaDoente(true);

        Cachorro cachorro2 = new Cachorro(Franklin);
        cachorro2.setNome("Rex");
        cachorro2.setRaca("Pitbull");
        cachorro2.setIdade(4);

        Cachorro cachorro3 = new Cachorro(Jessiany);
        cachorro3.setNome("Bolinha");
        cachorro3.setRaca("Pastor Alemão");
        cachorro3.setIdade(2);
        cachorro3.setEstaDoente(true);

        System.out.println(cachorro1);
        System.out.println(cachorro2);
        System.out.println(cachorro3);

        Internacoes internacoes = new Internacoes();
        internacoes.internar(cachorro1);
        internacoes.internar(cachorro3);

        internacoes.mostraCachorrosInternados();

    }
}
