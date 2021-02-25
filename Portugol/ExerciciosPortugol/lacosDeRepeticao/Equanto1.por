/*1 laco enquanto*/

programa
{
	
	funcao inicio()
	{
		real numero=1.00, somatorio =0.00, media = 0.00
		inteiro total = 0
	
		enquanto(numero > 0 ){
			escreva("Escreva um  numero positivo ")
			leia(numero)
			se(numero > 0){

			somatorio = somatorio + numero
			total ++ 
			}
			
			}
			media = somatorio/total 
			escreva("\nO total de numeros informado é: ", total)
			escreva("\nO somatorio é ", somatorio)
			escreva("A media é ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */