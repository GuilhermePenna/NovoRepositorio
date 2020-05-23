
public class Produto {
	public double preco;
	public String nome;
	public int quantidade;
	
	public Produto(double preco,String nome,int quantidade)
	{
		this.preco = preco;
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	public Produto(double preco,String nome)
	{
		this.nome = nome;
		this.preco = preco;
	}
	
	public double valorTotalDeEstoque()
	{
		return quantidade * preco;
	}
	
	public void addProduto(int quant)
	{
		quantidade+=quant;
	}
	
	public void removeProduto(int quant)
	{
		quantidade-=quant;
	}
}
