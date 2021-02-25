programa
{
/*
 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. , , 

Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.


Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades


se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades

se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades.




 */
	
	funcao inicio()
	{
		real grupoA, grupoB, grupoC
		real suspendeAtividadeUm = 0.55, suspendeAtividadeDois = 0.65, suspendeTodos = 0.75
		//entrada de dados 
		escreva("Lembrando que os indices são 0,05 a 0,25:  ")
		escreva("\nDigite o indice do Grupo A: ")
		leia(grupoA)
		escreva("\nDigite o indice do Grupo B: ")
		leia(grupoB)
		escreva("\nDigite o indice do Grupo C: ")
		leia(grupoC)
		//Processamentos /Tratativa
		se(grupoA >= suspendeAtividadeUm){
			escreva("Seu indice está Em", grupoA, " Suas atividades comercias estão suspensa")	
		}
		se(grupoB >= suspendeAtividadeUm){
			escreva("\nSeu indice está Em", grupoB, " Suas atividades comercias estão suspensa")
		}
		se(grupoC >= suspendeAtividadeUm){
			escreva("\nSeu indice está Em", grupoC, " Suas atividades comercias estão suspensa")
		}
		//Segunda Regra
		se(grupoA >= suspendeAtividadeDois){
			escreva("Seu indice está Em", grupoA, " Suas atividades comercias estão suspensa")	
		}
		se(grupoB >= suspendeAtividadeDois){
			escreva("\nSeu indice está Em", grupoB, " Suas atividades comercias estão suspensa")
		}
		se(grupoC >= suspendeAtividadeDois){
			escreva("\nSeu indice está Em", grupoC, " Suas atividades comercias estão suspensa")
		}
		
		//Terceira Regra
		se(grupoA >= suspendeTodos){
			escreva("Seu indice está Em", grupoA, " Suas atividades comercias estão suspensa")	
		}
		se(grupoB >= suspendeAtividadeUm){
			escreva("\nSeu indice está Em", grupoB, " Suas atividades comercias estão suspensa")
		}
		se(grupoC >= suspendeAtividadeUm){
			escreva("\nSeu indice está Em", grupoC, " Suas atividades comercias estão suspensa")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1871; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */