package model;

public abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    // Método abstrato = não tem implementação aqui
    // Obriga as classes filhas a implementarem

     public abstract void fazerSom();

    // Sobrescrevendo o toString para exibir o objeto de forma amigável
    @Override
    public String toString(){
        return "Animal" + nome;
    }
}

