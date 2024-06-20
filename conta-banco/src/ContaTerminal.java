import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    // TODO:CONHECER E IMPORTAR A CLASSE SCANNER
    // EXIBIR AS MENSAGENS PARA A CLASSE SCANNER
    // OBTER PELA CLASSE SCANNER OS VALORES DIGITADOS NO TERMINAL
    // EXIBIR MENSAGEM FINAL Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao DioBank!");

        System.out.println("Digite seu nome e sobrenome!" + " *Obrigatório");
        String[] nome = new String[1];
        nome[0] = scan.next();

        System.out.println("Olá, " + nome[0] + "!");
        String enter = scan.nextLine();

        System.out.println("Por favor, digite o número de sua agência");
        int[] agencia = new int[1];
        agencia[0] = scan.nextInt();

        System.out.println(nome[0] + ", digite o número de sua conta:");
        int[] conta = new int[1];
        conta[0] = scan.nextInt();

        System.out.println(nome[0] + ", Deposite um valor para que você possa acessar sua conta!");
        double[] saldo = new double[1];
        saldo[0] = scan.nextDouble();

        System.out.println("Olá, " + nome[0] + ", obrigado por utilizar nosso banco digital.");
        System.out.println("Sua agência é " + agencia[0] + ", sua conta é " + conta[0] + ".");
        System.out.println("Seu saldo é de R$" + saldo[0] + " e já está disponível.");
    }
}