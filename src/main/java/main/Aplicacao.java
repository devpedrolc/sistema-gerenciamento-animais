package main;

import model.Cachorro;
import model.Gato;
import service.AnimalService;

public class Aplicacao {

    public static void main(String[] args) {

        AnimalService service = new AnimalService();

        service.adicionarAnimal(new Cachorro(" rex"));
        service.adicionarAnimal(new Gato(" mimi"));

        System.out.println("==== Lista de Animais ====");
        service.listarAnimais();
        System.out.println("\n=== Sons===");
        service.fazerTodosEmitiremSom();

    }
}
