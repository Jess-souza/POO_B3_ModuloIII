package br.com.ada.petshop.businessobject;
import br.com.ada.petshop.modelo.Animais;
import java.util.Objects;

public class Internacoes {
    private Animais[] animaisInternados = new Animais[10];

    public void internar(Animais animais) {
        for (int i = 0; i < animaisInternados.length; i++) {
            animaisInternados[i] = animais;
            break;
        }
    }

    public void mostraAnimaisInternados() {
        System.out.println("-------------------------ANIMAIS INTERNADOS-------------------------");
        for (Animais animais : animaisInternados) {
            if (Objects.nonNull(animais)) {
                System.out.println(animais);
            }
        }
    }
}