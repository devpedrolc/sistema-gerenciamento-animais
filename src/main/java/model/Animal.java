package model;

// Classe abstrata base para os animais
public abstract class Animal {

    protected String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato
    public abstract void fazerSom();

    @Override
    public String toString() {
        return "Animal: " + nome;
    }
}