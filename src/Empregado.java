
public class Empregado {
	private String nome;
	private int id;
	private double salario;
	
	public Empregado(String nome,int id,double salario)
	{
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public void aumento(double valor)
	{
		salario+=valor;
	}
	
	public int getId()
	{
		return id;
	}
	public String toString()
	{
		return "id: "
				+String.format("%d %n",id)
				+"nome: "
				+String.format("%s %n",nome)
				+"salario"
				+String.format(": %.2f %n",salario); 
				
	}
}
