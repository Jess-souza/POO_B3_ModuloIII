package br.com.ada.petshop.businessobject;

import java.util.List;

public class Relatorio<T> {
    public void geraRelatorioUnico(T t) {
        System.out.println("-----------------RELATORIO INDIVIDUAL--------------------");
        System.out.println(t);

    }

    public void geraRelatorioEmGrupo(List<T> lista) {
        System.out.println("-----------------RELATORIO COMPLETO--------------------");
        for (T t : lista) {
            System.out.println(lista);
        }
    }


}
