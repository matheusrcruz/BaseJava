programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um numero positivo: ")
		leia(numero)
	
		se(numero%2 == 0 ){
			escreva("\nNumero digitado  é par ",numero )
			
			}senao{
				escreva("\nNumero digitado é impar ", numero)
			
			}
         	se(numero < 0 ){
           	escreva("O numero é negativo: por favor digite um numero valido e positivo:")
           	
           	}		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */