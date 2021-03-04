package OOP;

public class Funcionario {
	private String nome;
	private int matricula;
	protected int horasTrabalhada;
	protected double valorHora;
	
	
	
	
	public Funcionario(String nome, int matricula, int horasTrabalhada, double valorHora) {
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhada = horasTrabalhada;

	}

	//Encapsulamento
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public int getHorasTrabalhada() {
		return horasTrabalhada;
	}



	public void setHorasTrabalhada(int horasTrabalhada) {
		this.horasTrabalhada = horasTrabalhada;
	}



	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	//metodos
	public double salario() {
		return (horasTrabalhada* valorHora);
	}
	//sobreCarga do metodo
	public double salario(int imposto) {
		return (horasTrabalhada* valorHora) - ((horasTrabalhada* valorHora)*imposto);
	}

}

