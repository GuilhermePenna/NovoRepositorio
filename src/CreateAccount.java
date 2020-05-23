
public class CreateAccount {
	private final int numeroDaConta;
	private double saldo;
	private String nome;
	private  static int contador;
	public CreateAccount(int numeroDaConta,double valor,String nome)
	{
		this.numeroDaConta = numeroDaConta;
		deposito(valor);
		this.nome = nome;
		contador++;
	}
	
	public CreateAccount(int numeroDaConta,String nome)
	{
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		contador++;
	}
	
	public void  updateName(String novoNome)
	{
		nome = novoNome;
	}
	
	public void saque(double valor)
	{
		saldo-=valor+5;
	}
	
	public void deposito(double valor)
	{
		saldo+=valor;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String toString()
	{
		return "conta: "
				+numeroDaConta
				+" nome:"
				+nome
				+" saldo:$ "
				+String.format("%.2f",saldo);
				
	}
}
 