package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Test {

	public static void main(String[] args) {
		
		Scanner call = new Scanner(System.in);
		Conta conta1 = new Conta(1,"1111-1111-111-11");
		Conta conta2 = new Conta(2,"2111-1111-111-11");
		Conta conta3 = new Conta(3,"1111-1111-111-11");
		
		conta3.credito(100);
		conta3.debito(40);
		
		
		
		System.out.print(conta2.getNumero());
		

	}

}
