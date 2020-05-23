package curso_programacao;
import java.util.Scanner;

public class GetLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt();
		sc.nextLine();// usado para limpar o buffer de leitura;
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		System.out.printf("Dados digitados: %n %d %n %s %n %s %n %s",x,a,b,c);
		sc.close();
	}

}
