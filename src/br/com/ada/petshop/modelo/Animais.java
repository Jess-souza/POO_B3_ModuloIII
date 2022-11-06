package br.com.ada.petshop.modelo;

public class Animais {
    private int id;
    private String nome;
    private String raca;
    private int idade;
    private boolean estaDoente;
    private Dono dono;

    public Animais(Dono dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.err.println("Idade inválida, o cachorro não pode ter idade negativa");
        } else if (idade > 29) {
            System.err.println("Idade inválida, o cachorro não pode ter mais de 29 anos");
        } else {
            this.idade = idade;
        }
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public boolean getEstaDoente() {
        return estaDoente;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", estaDoente=" + estaDoente +
                ", dono=" + dono +
                '}';
    }
}
