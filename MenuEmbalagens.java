import java.util.Scanner;

public class MenuEmbalagens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("Escolha uma opção de embalagem:");
            System.out.println("1 - Caixa de papelão");
            System.out.println("2 - Sacola plástica");
            System.out.println("3 - Embalagem de vidro");
            System.out.println("4 - Sair");
            
            // Recebe a opção do usuário
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            
            // Processa a escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento.");
                    break;
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável.");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável.");
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
