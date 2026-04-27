package main;

import model.Cachorro;
import model.Gato;
import service.AnimalService;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        // Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Serviço responsável por gerenciar os animais
        AnimalService service = new AnimalService();

        int opcao;

        do {
            // Exibição do menu
            System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE ANIMAIS =====");
            System.out.println("1 - Adicionar Cachorro");
            System.out.println("2 - Adicionar Gato");
            System.out.println("3 - Listar Animais");
            System.out.println("4 - Fazer todos emitirem som");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer do Enter

            switch (opcao) {

                case 1:
                    System.out.print(" Digite o nome do cachorro: ");
                    String nomeCachorro = scanner.nextLine();

                    service.adicionarAnimal(new Cachorro(nomeCachorro));
                    System.out.println("Cachorro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print(" Digite o nome do gato: ");
                    String nomeGato = scanner.nextLine();

                    service.adicionarAnimal(new Gato(nomeGato));
                    System.out.println(" Gato adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println(" \n=== Lista de Animais === ");
                    service.listarAnimais();
                    break;

                case 4:
                    System.out.println("\n=== Sons dos Animais ===");
                    service.fazerTodosEmitiremSom();
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}