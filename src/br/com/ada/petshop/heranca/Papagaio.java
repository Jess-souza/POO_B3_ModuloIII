package br.com.ada.petshop.heranca;

public class Papagaio extends AvesQueVoam {

    public Papagaio() {
        System.out.println("Chamando construtor papagaio");
    }

    public void falar() {
        System.out.println("Papagaio falando: Quero comer!");
    }
}
