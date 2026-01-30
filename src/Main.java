import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SequentialStructure sequential = new SequentialStructure();
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Sistema de Cálculo de Metragem");
            System.out.println("2 - Sistema de Cálculo de Média de Idade");
            System.out.println("3 - Sistema de Cálculo de Média de Notas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sequential.SistemaDeCalculoDeMetragem();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 2:
                    sequential.SistemaCalculoMediaIdade();
                case 3:
                    sequential.SistemaCalculoMediaNota();
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}