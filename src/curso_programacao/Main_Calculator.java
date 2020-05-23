package curso_programacao;

import java.util.Scanner;

public class Main_Calculator {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("insert radius:");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumferencia(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumferencia: %.2f %n",c);
		System.out.printf("Volume %.2f %n",v);
		System.out.printf("Valor de PI: %.2f %n",Calculator.PI);
		*/
		
		// Exercicio do Dolar
		//sem criar um objeto do tipo Dolar por causa do metodo/atributo estatico na classe Dolar
		Scanner sc = new Scanner(System.in);
		System.out.printf("Valor do dolar = %.2f %n",Dolar.valorDolar); 
		System.out.println("Quantos dolares voce quer comprar?");
		double valor  = sc.nextDouble();
		System.out.printf("Valor total a pagar = %.2f%n",Dolar.converter(valor));
		
		
		
	}

}
