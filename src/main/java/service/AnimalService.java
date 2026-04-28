package service;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    private List<Animal> animais = new ArrayList<>();

    // Adicionar animal
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    // Listar animais
    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal a : animais) {
            System.out.println(a);
        }
    }

    // Fazer todos emitirem som
    public void fazerTodosEmitiremSom() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal a : animais) {
            a.fazerSom();
        }
    }

    // Buscar animal por nome
    public void buscarAnimal(String nome) {
        for (Animal a : animais) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Animal encontrado:");
                System.out.println(a);
                return;
            }
        }

        System.out.println("Animal não encontrado.");
    }

    // Atualizar nome do animal
    public void atualizarAnimal(String nomeAntigo, String novoNome) {
        for (Animal a : animais) {
            if (a.getNome().equalsIgnoreCase(nomeAntigo)) {
                a.setNome(novoNome);
                System.out.println("Nome atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Animal não encontrado.");
    }

    // Remover animal
    public void removerAnimal(String nome) {
        for (Animal a : animais) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                animais.remove(a);
                System.out.println("Animal removido com sucesso!");
                return;
            }
        }

        System.out.println("Animal não encontrado.");
    }
}