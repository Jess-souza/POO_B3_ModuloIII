package br.com.ada.petshop.modelo;

public class Gato extends Animais{
    public Gato(Dono dono) {
        super(dono);
    }

    @Override
    public String toString() {
        return "Gato" +
        super.toString();
    }
}
