programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro num1 = 0, num2 = 0, num3 = 0, num4 = 0
		inteiro quad1 = 0,quad2 = 0 ,quad3 = 0 ,quad4 = 0
		//entrada de dados
		escreva("\nDIgite um numero: ")
		leia(num1)
		escreva("\nDIgite um numero: ")
		leia(num2)
		escreva("\nDIgite um numero: ")
		leia(num3)
		escreva("\nDIgite um numero: ")
		leia(num4)
		//Numeros elevado ao quadrado == processamento
		quad1 = Mat.potencia(num1, 2)
		quad2 = Mat.potencia(num2, 2)
		quad3 = Mat.potencia(num3, 2)
		quad4 = Mat.potencia(num4, 2)
		
		se(quad3 >= 1000){//Bom e velho laço condicional
		escreva("O valor é ",num3," eo quadrado é ",quad3)
		}senao{
		 escreva("\nO valor é ", num1, "eo quadrado é  ", quad1)
		 escreva("\nO valor é ", num2, "eo quadrado é  ", quad2)
		 escreva("\nO valor é ", num3, "eo quadrado é  ", quad3)
		 escreva("\nO valor é ", num4, "eo quadrado é  ", quad4)	
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */