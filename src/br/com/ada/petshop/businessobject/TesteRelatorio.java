package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.*;

import java.util.List;

public class TesteRelatorio {
    public static void main(String[] args) {

        Dono Jessica = new Dono("Jessica", new Endereco());
        Atendente atendente = new Atendente("Jessica", new Endereco());

        Cachorro cachorro = new Cachorro(Jessica);
        cachorro.setNome("Totó");

        Gato gato = new Gato(Jessica);
        gato.setNome("Miau");

        Relatorio<Animal> relatorioAnimais = new Relatorio();

        relatorioAnimais.geraRelatorioUnico(cachorro);

        List<Animal> animais = List.of(cachorro, gato);
        relatorioAnimais.geraRelatorioEmGrupo(animais);

        Relatorio<Pessoa> relatorioPessoas = new Relatorio();
        relatorioPessoas.geraRelatorioUnico(atendente);
    }
}
