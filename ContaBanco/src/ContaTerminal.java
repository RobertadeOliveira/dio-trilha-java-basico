import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Bem-vindo ao programa de criação de conta bancária!");
        System.out.println("Por favor, digite os seguintes dados:");

        // Obter pela Scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo disponível: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println();
        System.out.println("=== Conta Criada ===");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + " já está disponível para saque.");

        // Fechar o Scanner
        scanner.close();
    }
}
