package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Animal;

import java.util.Objects;

public class Internacoes {
    private Animal[] animaisInternados = new Animal[10];

    public void internar(Animal animal) {
        for (int i = 0; i < animaisInternados.length; i++) {
            if (Objects.isNull(animaisInternados[i])) {
                animaisInternados[i] = animal;
                break;
            }
        }
    }

    public void mostraAnimaisInternados() {
        System.out.println("-------------------------ANIMAIS INTERNADOS-------------------------");
        for (Animal animal : animaisInternados) {
            if (Objects.nonNull(animal)) {
                System.out.println(animal);
            }
        }
    }
}