package main;

import model.Cachorro;
import model.Gato;
import service.AnimalService;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AnimalService service = new AnimalService();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE ANIMAIS =====");
            System.out.println("1 - Adicionar Cachorro");
            System.out.println("2 - Adicionar Gato");
            System.out.println("3 - Listar Animais");
            System.out.println("4 - Buscar Animal por Nome");
            System.out.println("5 - Atualizar Nome do Animal");
            System.out.println("6 - Remover Animal");
            System.out.println("7 - Fazer todos emitirem som");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do cachorro: ");
                    String nomeCachorro = scanner.nextLine();

                    service.adicionarAnimal(new Cachorro(nomeCachorro));
                    System.out.println("Cachorro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do gato: ");
                    String nomeGato = scanner.nextLine();

                    service.adicionarAnimal(new Gato(nomeGato));
                    System.out.println("Gato adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n=== Lista de Animais ===");
                    service.listarAnimais();
                    break;

                case 4:
                    System.out.print("Digite o nome do animal para buscar: ");
                    String nomeBusca = scanner.nextLine();

                    service.buscarAnimal(nomeBusca);
                    break;

                case 5:
                    System.out.print("Digite o nome atual do animal: ");
                    String nomeAtual = scanner.nextLine();

                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();

                    service.atualizarAnimal(nomeAtual, novoNome);
                    break;

                case 6:
                    System.out.print("Digite o nome do animal para remover: ");
                    String nomeRemover = scanner.nextLine();

                    service.removerAnimal(nomeRemover);
                    break;

                case 7:
                    System.out.println("\n=== Sons dos Animais ===");
                    service.fazerTodosEmitiremSom();
                    break;

                case 8:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 8);

        scanner.close();
    }
}