import java.util.Scanner;

public class MenuCanetas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("Escolha uma opção de caneta:");
            System.out.println("1 - Caneta Esferográfica");
            System.out.println("2 - Caneta Gel");
            System.out.println("3 - Caneta Tinteiro");
            System.out.println("4 - Sair");
            
            // Recebe a opção do usuário
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            
            // Processa a escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.println("Caneta Esferográfica: Econômica e de longa duração.");
                    break;
                case 2:
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave.");
                    break;
                case 3:
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia.");
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
