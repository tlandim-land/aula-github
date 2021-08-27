import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("THIAGO");
		list.add("RAYANA");
		list.add("JOÃO");
		list.add("JOSE");
		list.add("JOAQUIM");
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println(list.size());
		
		System.out.println("--- ADICIONA ELEMENTOS NA LISTA - POSICIONAL ---");
		
		list.add(2, "ARTHUR");

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println(list.size());
		
		System.out.println("--- REMOVE ELEMENTOS NA LISTA - POR COMPARAÇÃO ---");
		
		// tem uma inteligencia interna para encontrar exatamente o que se quer remover
		list.remove("tHIAGO");
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println(list.size());
		
		System.out.println("--- REMOVE ELEMENTOS NA LISTA - POSICIONAL ---");

		// tem uma inteligencia interna para encontrar exatamente o que se quer remover
		list.remove(1);
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println(list.size());

		System.out.println("--- REMOVE ELEMENTOS NA LISTA - POR EXPRESSAO DE COMPARACAO ---");

		list.removeIf(obj -> obj.charAt(0) == 'J');
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println(list.size());
		
		System.out.println("--- MOSTRA POSICAO DE UM ELEMENTO DA LISTA - ENCONTRANDO ---");
		System.out.println(list.indexOf("ARTHUR"));
		
		System.out.println("--- MOSTRA POSICAO DE UM ELEMENTO DA LISTA - NÃO ENCONTRANDO ---");
		System.out.println(list.indexOf("BERNARDO"));
	}

}
