package desafioProgramador;

public class Animal {
	private String nome;
	private int idade;
	

//Construtor constroe a obra ele pede o cimento os blocos //nome idade
public Animal(String nome, int idade) {
	this.nome  = nome;
	this.idade = idade;
	
	
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public int getIdade() {
	return idade;
}


public void setIdade(int idade) {
	this.idade = idade;
}

//Metodos
public void  EmiteSom() {
	
System.out.println("som animal");
}
public void Correr() {
	
}
public void Acao() {
	
}


}


