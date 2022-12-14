package br.com.ada.petshop.modelo;

import br.com.ada.petshop.enumeracao.EnumRacaCachorro;

public class Cachorro extends Animal implements Internavel {

    private boolean estaDoente;
    private EnumRacaCachorro raca;

    public Cachorro(Dono dono) {
        super(dono);
    }

    public EnumRacaCachorro getRaca() {
        return raca;
    }

    public void setRaca(EnumRacaCachorro raca) {
        this.raca = raca;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    @Override
    public boolean estaDoente() {
        return this.estaDoente;
    }
    @Override
    public String toString() {
        return "Cachorro:" +
                " raca=" + raca +
                super.toString();
    }
}