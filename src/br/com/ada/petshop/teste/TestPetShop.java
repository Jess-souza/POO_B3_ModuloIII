package br.com.ada.petshop.teste;

import br.com.ada.petshop.enumeracao.EnumRacaCachorro;
import br.com.ada.petshop.enumeracao.EnumRacaGato;
import br.com.ada.petshop.repository.AnimalRepository;
import br.com.ada.petshop.businessobject.Internacoes;
import br.com.ada.petshop.modelo.*;

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
        cachorro1.setRaca(EnumRacaCachorro.PIT_PULL);
        cachorro1.setIdade(7);
        cachorro1.setEstaDoente(true);

        Cachorro cachorro2 = new Cachorro(Franklin);
        cachorro2.setNome("Rex");
        cachorro2.setRaca(EnumRacaCachorro.VIRA_LATA);
        cachorro2.setIdade(4);

        Gato gato = new Gato(Jessica);
        gato.setNome("Miau");
        gato.setRaca(EnumRacaGato.SIAMES);
        gato.setIdade(3);
        gato.setEstaDoente(true);

        AnimalRepository cadastrar = new AnimalRepository();
        cadastrar.cadastro(cachorro1);
        cadastrar.cadastro(cachorro2);
        cadastrar.cadastro(gato);
        cadastrar.mostraAnimaisCadastrados();

        Internacoes internacoes = new Internacoes();
        internacoes.internar(cachorro1);
        internacoes.internar(gato);
        internacoes.mostraAnimaisInternados();
    }
}
