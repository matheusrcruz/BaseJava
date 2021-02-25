programa
{
/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo    */
	
	funcao inicio()
	{
		//Entrada
		real tomates = 0.00, E = 0.00, M= 0.00
		const real PESO = 50.00 const real TAXA = 4.00
		escreva("Digite a quantidade de tomates que foi comprado? ")
		leia(tomates)
		//Regras
		E =(tomates - PESO)
		M = (E * TAXA)
		
		se(tomates>TAXA){
			escreva("\nA multa,por execesso é de ", M,"R$ voce adquirio ",E,"Kg de tomates a mais do que é permitido")
			
		}senao{
			escreva("Voce comprou ",tomates,"Kg de tomates está nos conforme")
			}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 945; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */