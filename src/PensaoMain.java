import java.util.Scanner;

public class PensaoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pensao [] pensao = new Pensao[10];
		System.out.println("Quantos quartos seram alugados?");
		int quantQuartos = sc.nextInt();
		String nome;
		String email;
		int numQuarto;
		for (int i = 0; i < quantQuartos; i++) {
			System.out.println("Digite seu nome");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Digite seu email");
			email = sc.next();
			System.out.println("Digite o numero do quarto escolhido");
			numQuarto = sc.nextInt();
			if(verificaQuarto(pensao,numQuarto))
			{
				pensao[i] = new Pensao(nome,email,numQuarto);
			}
			else
			{
				System.out.println("Esse quarto ja esta alugado,escolha outro");
				numQuarto = sc.nextInt();
				while(verificaQuarto(pensao,numQuarto)==false)
				{
					System.out.println("Esse quarto ja esta alugado,escolha outro");
					numQuarto = sc.nextInt();
				}
				pensao[i] = new Pensao(nome,email,numQuarto);
			}
		}
		System.out.println("Quartos ocupados:");
		for (int i = 0; i <quantQuartos; i++) {
			System.out.println(pensao[i]);
		}

	}
	
	public static boolean verificaQuarto(Pensao[] vetor,int num)
	{
		
		if(vetor[num]==null) return true;
		return false;
		
	}

}
