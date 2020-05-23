
public class Pensao {
	private String  nome;
	private  String email;
	private int numero;
	
	public Pensao(String nome,String email,int numero)
	{
		this.nome  = nome;
		this.email = email;
		this.numero = numero;
	}
	
	public String toString()
	{
		return 
				+numero+": "
				+nome +','
				+email;    
	}
}
