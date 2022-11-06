package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Cachorro;

import java.util.Objects;

public class CachorroRepository {


    private static Cachorro[] cadastro = new Cachorro[10];
    private static int count = 0;
    private static int sequence = 1;

    public void cadastro(Cachorro cachorro) {
        setId(cachorro);
        redimensionaArray();

        if (Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())) {
            cadastro[count] = cachorro;
            count++;
        } else {
            System.out.println("O cachorro não pode ser null ou sem dono");
        }
    }

    private void setId(Cachorro cachorro) {
        cachorro.setId(sequence);
        cachorro.getDono().setId(sequence);
        cachorro.getDono().getEndereco();
        cachorro.getDono().getEndereco().setId(sequence);
        sequence++;
    }

    private void redimensionaArray() {
        boolean temPosicaoLivre = false;
        for (int i = 0; i < cadastro.length; i++) {
            if (Objects.isNull(cadastro[i])) {
                temPosicaoLivre = true;
            }
        }

        if (!temPosicaoLivre) {
            Cachorro[] cachorrosCadastrados2 = new Cachorro[cadastro.length + 1];
            for (int i = 0; i < cadastro.length; i++) {
                cachorrosCadastrados2[i] = cadastro[i];
            }
            cadastro = cachorrosCadastrados2;
        }
    }

    public void mostraCachorrosCadastrados() {
        System.out.println("-------------------------DOGS CADASTRADOS-------------------------");
        boolean existeCaoCadastrado = false;
        for (Cachorro cachorro : cadastro) {
            if (Objects.nonNull(cachorro)) {
                existeCaoCadastrado = true;
                System.out.println(cachorro);
            }
        }
    }
}
