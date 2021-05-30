package collectionsLmbExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class Exemplo1 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		//adiciona nome
		nomes.add("Matheus");
		nomes.add("Maria");
		nomes.add("Singed");
		//remove
		//nomes.remove("Singed");
		
		//Percorre for/for aprimorado/foreach metodo
		/*for(int i = 0; i< nomes.size(); i++) {
			System.out.println("Nomes" + nomes.get(i));
			
		}
		for(String nome: nomes) {
			System.out.println("Nome " + nome);
		}
	
		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		//percorrendo com lambidaExpression
		nomes.forEach(nome ->System.out.println(nome));
		*/
		//Methodo reference
		nomes.forEach( System.out::println);

	}

}
