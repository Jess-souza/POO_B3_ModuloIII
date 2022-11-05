package br.com.ada.petshop.heranca;

public abstract class AvesQueVoam extends Ave{
    private String voo;

    private int autitude;

    public AvesQueVoam() {
        System.out.println("Chamando construtor ave");
    }

    public int getAutitude() {
        return autitude;
    }

    public void setAutitude(int autitude) {
        this.autitude = autitude;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }
}
