import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de operações
            System.out.println("Escolha a operação desejada:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            
            // Recebe a opção do usuário
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            
            if (opcao == 5) {
                System.out.println("Saindo... Até logo!");
                break;
            }

            // Solicita os dois números ao usuário
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Realiza a operação escolhida
            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado da divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Erro! Não é possível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println(); // Linha em branco para separar as interações

        } while (opcao != 5); // Repete o menu até o usuário escolher sair
        
        scanner.close();
    }
}
