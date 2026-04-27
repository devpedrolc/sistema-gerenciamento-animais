package model;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom(){
       System.out.println(nome + " está latindo");
   }
   @Override
    public String toString(){
        return " Cachorro " + nome;
   }








}
