import java.util.Scanner;
import java.util.Locale;
public class Main_Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CreateAccount account;
		System.out.println("digito o numero da conta: ");
		int numAccount = sc.nextInt();
		
		System.out.println("digite o nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Gostaria de fazer um deposito inicial? Responda s para sim e n para nao ");
		char depositoInicial = sc.next().charAt(0);
		double saldo = 0.0;
		if(depositoInicial=='s')
		{
			System.out.println("Digite o valor do saldo inicial:");
			saldo = sc.nextDouble();
			account = new CreateAccount(numAccount,saldo,nomeTitular);
		}
		
		else 
		{
			 account = new CreateAccount(numAccount,nomeTitular);
			
		}
		
		System.out.println("Dados da conta:");
		//System.out.printf("Numero da conta: %d, Nome do titular: %s, Saldo Inicial: %.2f%n",numAccount,account.getNome(),account.getSaldo());
		System.out.println(account);
	   
		 System.out.println("Entre com um valor de depostivo:");
		 account.deposito(sc.nextDouble());
		 System.out.printf("Numero da conta: %d, Nome do titular: %s, Saldo Inicial: %.2f%n",numAccount,account.getNome(),account.getSaldo());
		 
		 System.out.println("Entre com um valor de saque:");
		 account.saque(sc.nextDouble());
		 System.out.printf("Numero da conta: %d, Nome do titular: %s, Saldo Inicial: %.2f%n",numAccount,account.getNome(),account.getSaldo());
	}

}
