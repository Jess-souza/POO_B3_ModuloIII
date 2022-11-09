package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Animal;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Internacoes {

    private final int NUMERO_VAGAS = 10;
    private Set<Animal> animaisInternados = new HashSet<>();

    public void internar(Animal animal) {
        if (animaisInternados.size() < NUMERO_VAGAS) {
            animaisInternados.add(animal);
        } else {
            System.err.println("Não há vagas");
        }
    }

    public void mostraAnimaisInternados() {
        System.out.println("-------------------------ANIMAIS INTERNADOS-------------------------");
        for (Animal animal : animaisInternados) {
            System.out.println(animal);
        }
    }
}
