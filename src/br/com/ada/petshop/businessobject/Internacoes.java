package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Cachorro;

import java.util.Objects;

public class Internacoes {

    private Cachorro[] cachorrosInternados = new Cachorro[10];


    public void internar(Cachorro cachorro) {
        for (int i = 0; i < cachorrosInternados.length; i++) {
            cachorrosInternados[i] = cachorro;
            break;
        }
    }



    public void mostraCachorrosInternados() {
        for (Cachorro cachorro : cachorrosInternados) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }
}
