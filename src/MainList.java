import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("guilherme");
		list.add("maria");
		list.add("yummi");
		list.add("gustavo");
		
		list.add(2,"alejandro");
		
		list.remove("alejandro");
		list.remove(1);
		//list.removeIf(x->x.charAt(0)=='g');// remove um ou mais objetos da list de acordo com a condicao
		
		System.out.println(list.size());
		System.out.println(list.indexOf("yummi"));//imprime a posicao de um objeto na lista
		
		for(String x: list)
		{
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		List<String> listaG = list.stream().filter(x->x.charAt(0)=='g').collect(Collectors.toList()); //cria uma lista nova de acordo com a condicao
		
		
		for(String x:listaG)
		{
			System.out.println(x);
		}
		
		String nameG = listaG.stream().filter(x->x.charAt(0)=='g').findFirst().orElse(null); //encontra um determinado objeto na lista de acordo com a condicao
		System.out.println("Primeiro nome com g encontrado na lista:"+nameG);
	}

}
