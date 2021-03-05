	package OOP;

public class Terceiro extends Funcionario {
	private double adicional;
	
	public Terceiro(String nome, int matricula, int horasTrabalhada, double valorHora) {
		super(nome, matricula, horasTrabalhada, valorHora);
	}
	
	//encapsular os atributos
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
		//Override e gambiarra em ingles
	
	@Override
	public double salario() {
		return (horasTrabalhada* valorHora) + adicional;
	}

}
