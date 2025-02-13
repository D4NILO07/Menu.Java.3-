import java.util.Scanner;

public class MenuMochilas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("Escolha uma opção de mochila:");
            System.out.println("1 - Mochila Escolar");
            System.out.println("2 - Mochila de Viagem");
            System.out.println("3 - Mochila Esportiva");
            System.out.println("4 - Sair");
            
            // Recebe a opção do usuário
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            
            // Processa a escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.println("Mochila Escolar: Compacta e ideal para estudantes.");
                    break;
                case 2:
                    System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas.");
                    break;
                case 3:
                    System.out.println("Mochila Esportiva: Leve, resistente e ergonômica.");
                    break;
                case 4:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
            System.out.println(); // Apenas para deixar uma linha em branco entre as interações
        } while (opcao != 4); // Repete o menu até o usuário escolher a opção de sair
        
        scanner.close();
    }
}
