package model;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " está miando");
    }

    @Override
    public String toString() {
        return " Gato " + nome;
    }
}

