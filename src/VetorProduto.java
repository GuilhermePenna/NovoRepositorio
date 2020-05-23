
public class VetorProduto {
	private double valor;
	private String name;
	
	public VetorProduto(double valor, String name) {
		super();
		this.valor = valor;
		this.name = name;
	}

	public double getValor()
	{
		return valor;
	}

	public String toString()
	{
		return "Nome: "
				+name
				+" Valor: "
				+valor;
	}
}
