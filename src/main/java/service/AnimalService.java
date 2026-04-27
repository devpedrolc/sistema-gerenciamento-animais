package service;

import model.Animal;
import java.util.ArrayList;
import java.util.List;

 public class AnimalService {
 private List<Animal> animais = new ArrayList<>();

   public void adicionarAnimal(Animal animal){
       animais.add(animal);
   }

   public void listarAnimais(){
       for( Animal a : animais){
           System.out.println(a);
       }
   }
   public void fazerTodosEmitiremSom(){
       for (Animal a : animais){
           a.fazerSom();
       }
   }



}
