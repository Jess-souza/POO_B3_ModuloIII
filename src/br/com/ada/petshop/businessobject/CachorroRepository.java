package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Cachorro;

import java.util.Objects;

public class CachorroRepository {

    private Cachorro[] cadastro = new Cachorro[10];
    private int count = 0;

    public void cadastro(Cachorro cachorro) {
        if (Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())) {
            cadastro[count] = cachorro;
            count++;
        } else {
            System.out.println("O cachorro não pode ser null ou sem dono");
        }
    }

    public void mostraCachorrosCadastrados() {
        System.out.println("-------------------------DOGS CADASTRADOS-------------------------");
        for (Cachorro cachorro : cadastro) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }
}
