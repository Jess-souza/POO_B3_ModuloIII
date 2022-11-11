package br.com.ada.petshop.modelo;

import br.com.ada.petshop.enumeracao.TipoAnimalEnum;

public abstract class Animal {
    private int id;
    private String nome;
    private int idade;
    private Dono dono;
    private TipoAnimalEnum tipoAnimal;
    public Animal(Dono dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setTipoAnimal(TipoAnimalEnum tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public TipoAnimalEnum getTipoAnimal() {
        return tipoAnimal;
    }

    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                ", tipoAnimal=" + tipoAnimal +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dono=" + dono +
                '}';
    }
}
