package br.com.ada.petshop.repository;

import br.com.ada.petshop.modelo.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnimalRepository {


    // private static Animal[] cadastro = new Animal[10];
    private static List<Animal> cadastro = new ArrayList<>();
    private static int count = 0;
    private static int sequence = 1;

    public void cadastro(Animal animal) {
        setId(animal);
        // redimensionaArray();

        if (Objects.nonNull(animal) && Objects.nonNull(animal.getDono())) {
            // cadastro[count] = animal;
            //count++;
            cadastro.add(animal);
        } else {
            System.out.println("O animal não pode ser null ou sem dono");
        }
    }

    private void setId(Animal animal) {
        animal.setId(sequence);
        animal.getDono().setId(sequence);
        animal.getDono().getEndereco();
        animal.getDono().getEndereco().setId(sequence);
        sequence++;
    }


    /*private void redimensionaArray() {
        boolean temPosicaoLivre = false;
        for (int i = 0; i < cadastro.length; i++) {
            if (Objects.isNull(cadastro[i])) {
                temPosicaoLivre = true;
            }
        }

        if (!temPosicaoLivre) {
            Animal[] animalCadastrados2 = new Animal[cadastro.length + 1];
            for (int i = 0; i < cadastro.length; i++) {
                animalCadastrados2[i] = cadastro[i];
            }
            cadastro = animalCadastrados2;
        }
    }*/

    public void mostraAnimaisCadastrados() {
        System.out.println("-------------------------ANIMAIS CADASTRADOS-------------------------");
        //  boolean existeAnimalCadastrado = false;
        for (Animal animal : cadastro) {
            // if (Objects.nonNull(animal)) {
            //     existeAnimalCadastrado = true;
            System.out.println(animal);
        }
        if (cadastro.isEmpty()){
            System.out.println("-------------------------ANIMAIS ZERADOS-------------------------");
        }
    }
}

