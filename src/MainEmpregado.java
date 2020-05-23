import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmpregado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Empregado> listaEmpregados = new ArrayList<>();
		System.out.println("Digite quantos empregados serao registrados");
		int numEmpregados = sc.nextInt();
		String nome;
		int id;
		double salario;
		for (int i = 0; i < numEmpregados; i++) {
			System.out.println("Digite o nome do empregado:");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("digite o id do empregado:");
			id = sc.nextInt();
			while(hasId(listaEmpregados,id))
			{
				System.out.println("Este id ja existe,digite outro id");
				id = sc.nextInt();
			}
			System.out.println("Digite o salario inicial do empregado:");
			 salario = sc.nextDouble();
			listaEmpregados.add(new Empregado(nome,id,salario));
		}
		System.out.println("Digite o id do funcionario que ira receber um aumento:");
		int numeroId = sc.nextInt();
		Empregado emp = (listaEmpregados.stream().filter(x->x.getId() == numeroId).findFirst().orElse(null));
		if(emp==null)
		{
			 System.out.println("Esse funcionario nao existe");
		}
		
		else
		{
			System.out.println("digite o valor do aumento");
			double valor = sc.nextDouble();
			emp.aumento(valor);
		}
		
		System.out.println("Lista de empregados");
		for(Empregado x :listaEmpregados)
		{
			System.out.println(x);
		}
	}
	public static boolean hasId(List<Empregado> list,int id)
	{
		Empregado emp = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return emp!=null; 
	}

}
