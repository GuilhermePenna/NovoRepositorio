import java.util.Scanner;
import java.util.Locale;
public class Main_produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		double preco = sc.nextDouble();
		//int quantidade = sc.nextInt();
		
		Produto novo = new Produto(preco,nome);
		System.out.printf("nome : %s%npreco: %.2f%nquantidade: %d%n",nome,preco,novo.quantidade);
		novo.addProduto(10);
		System.out.println(novo.quantidade);
		novo.removeProduto(1);
		System.out.println(novo.quantidade);
	}

}
