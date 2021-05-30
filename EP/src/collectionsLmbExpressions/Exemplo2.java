package collectionsLmbExpressions;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		List<Cliente>clientes = new ArrayList<>();
		//populando objeto lista
	clientes.add(new Cliente(1L, "Matheus"));
	clientes.add(new Cliente(2L, "ivern"));
	clientes.add(new Cliente(3L, "Singed"));
	
	//Listando Objeto
	clientes.forEach(cliente -> System.out.printf("ID: %d Nome: %s %n", cliente.getId(), cliente.getNome()));

	}

}
