package curso_programacao;

public class Dolar {
	//criando um metedo/atributo estatico não é nescessario  criar um objeto na main para utiliza-los
	public static Double valorDolar = 3.10;  
	public static double converter(double valor)
	{
		return (valor + ( 6*valor/100)) * valorDolar ; 
	}
}
