programa
{
/*
2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/
	
	funcao inicio()
	{
		inteiro C =0, N = 0, M = 0, E = 0, T = 0
		escreva("Digite a quantidade de horas que voce trabalhou hoje: ")
		leia(C)
		
		N =(C * 10)//Valor hora
		E = (N - 50)//Taxa Horas a mais trabalhada
		T = (E * 2) + N
		
		se(N > 50){
		escreva("Voce excedeu o horario, entrou como horas extra: ", T, " Ja que voce trabalhou ", C)
			
		}senao{
			escreva("Voce cumpriu o seu horario:  ", C)	
		}
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 690; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */