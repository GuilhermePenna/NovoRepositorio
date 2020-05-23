import java.util.Scanner;

public class Main_vetor {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite o numero de produtos:");
		int np = sc.nextInt();
		VetorProduto[] vetProds = new VetorProduto[np];
		String nome;
		double valor;
		for (int i = 0; i < vetProds.length; i++) {
			sc.nextLine();
			System.out.println("digite o nome do produto");
			 nome = sc.nextLine();
			System.out.println("digite o valor do produto");
			valor = sc.nextDouble();
			vetProds[i] = new VetorProduto(valor,nome);
		}
		double media = 0;
		for (int i = 0; i < vetProds.length; i++) {
			System.out.println(vetProds[i]);
			media+=vetProds[i].getValor();
		}
		System.out.println("media = "+media/np);
	}

}
