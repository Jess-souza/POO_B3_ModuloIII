package br.com.ada.petshop.interfaces;

public class Assinadora extends Classe1 implements Contrato, AditivoContratual{
    @Override
    public void clausula1() {
        System.out.println("Implementando clausula 1");
    }

    @Override
    public void clausula2() {
        System.out.println("Implementando clausula 2");
    }

    @Override
    public int clausula3() {
        return 0;
    }

    @Override
    public boolean clausula4(String s) {
        boolean curtiu = s.equals("Joinha");
        return curtiu;
    }

    @Override
    public void novaClasseDoAditivo() {
    }
}
