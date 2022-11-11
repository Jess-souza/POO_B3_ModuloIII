package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Animal;
import br.com.ada.petshop.modelo.Internavel;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Internacoes {

    private final int NUMERO_MAXIMO_VAGAS = 6;

    private Set<Internavel> animaisInternados = new HashSet<>();

    public void internar(Internavel internavel){
        if (animaisInternados.size() < NUMERO_MAXIMO_VAGAS) {
            animaisInternados.add(internavel);
        } else{
            System.err.println("Não há vagas");
        }
    }

    public void mostraAnimaisInternados(){
        System.out.println("-----------------ANIMAIS INTERNADOS--------------------");
        for (Internavel internavel: animaisInternados) {
            System.out.println(internavel);
        }
    }
}
