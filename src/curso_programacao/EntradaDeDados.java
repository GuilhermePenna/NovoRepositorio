package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


public class EntradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("digite alguma coisa");
		String x = sc.next();
		System.out.println(x);
		System.out.println("voce digitou: " + x);
		
		System.out.println("Digite algum numero");
		int a  = sc.nextInt();
		System.out.println("voce digitou: "+ a);
		
		
		System.out.println("Digite algum numero decimal");
		double b = sc.nextDouble();
		System.out.printf("voce digitou %.1f %n",b);
		System.out.println(b);
		
		System.out.println("Digite uma letra");
		char c = sc.next().charAt(0);
		System.out.println("voce digitou:" + c);
		sc.close();
	}

}
