package br.com.ada.petshop.modelo;

public class Cachorro extends Animais{
    public Cachorro(Dono dono) {
        super(dono);
    }
    @Override
    public String toString() {
        return "Cachorro" +
                super.toString();
    }
}