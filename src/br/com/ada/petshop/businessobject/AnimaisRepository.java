package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Animais;

import java.util.Objects;

public class AnimaisRepository {


    private static Animais[] cadastro = new Animais[10];
    private static int count = 0;
    private static int sequence = 1;

    public void cadastro(Animais animais) {
        setId(animais);
        redimensionaArray();

        if (Objects.nonNull(animais) && Objects.nonNull(animais.getDono())) {
            cadastro[count] = animais;
            count++;
        } else {
            System.out.println("O cachorro não pode ser null ou sem dono");
        }
    }

    private void setId(Animais animais) {
        animais.setId(sequence);
        animais.getDono().setId(sequence);
        animais.getDono().getEndereco();
        animais.getDono().getEndereco().setId(sequence);
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
            Animais[] animaisCadastrados2 = new Animais[cadastro.length + 1];
            for (int i = 0; i < cadastro.length; i++) {
                animaisCadastrados2[i] = cadastro[i];
            }
            cadastro = animaisCadastrados2;
        }
    }

    public void mostraAnimaisCadastrados() {
        System.out.println("-------------------------ANIMAIS CADASTRADOS-------------------------");
        boolean existeAnimalCadastrado = false;
        for (Animais animais : cadastro) {
            if (Objects.nonNull(animais)) {
                existeAnimalCadastrado = true;
                System.out.println(animais);
            }
        }
    }
}
