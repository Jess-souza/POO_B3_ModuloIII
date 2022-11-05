package br.com.ada.petshop.heranca;

public class TesteHerancaPolimorfismo {
    public static void main(String[] args) {
        AvesQueVoam papagaio = new Papagaio();
        papagaio.setVoo("Papagaio voando");
        papagaio.getVoo();
        //papagaio.falar();

        System.out.println(papagaio.getVoo());

        AvesQueVoam andorinha = new Andorinha();
        andorinha.setVoo("Andorinha voando");
        andorinha.getVoo();
        //andorinha.bicar();

        System.out.println(andorinha.getVoo());

        AvesQueVoam garrincha = new Garrincha();
        Ave pinguim = new Pinguim();

        RestaurarAsaAve restaurarAsaAve = new RestaurarAsaAve();
        restaurarAsaAve.restauraAsaAve(papagaio);
        restaurarAsaAve.restauraAsaAve(andorinha);
        restaurarAsaAve.restauraAsaAve(garrincha);

    }
}
