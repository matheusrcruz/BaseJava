
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
		public int getNumero() {
		return numero;
 * 
 * 
 * */
package OOP;

public class ClasseClienteEx1 
{
	String nomeCliente;
	private String cpfCliente;
	//private	int anoNascimentoCliente;
	//private double AlturaCliente;	
	
	//Constructor tentativa com constructor e encap´sulamento
	/*public ClasseClienteEx1(String nomeCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;	
	}
	public String getNomeCliente()
	{
		String saudacao ="OI";
		return nomeCliente + saudacao;	
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		
	}*/
	public String setCpfCliente(String cpfCliente ) {
		this.cpfCliente = cpfCliente;
		return cpfCliente;
		
	}
	public void nomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		System.out.println(nomeCliente);
	}
	
	
	
		
}



 
