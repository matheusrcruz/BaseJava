algoritmo "semnome"
var

anoAtual,anoNascimento, idade: inteiro

inicio

      escreva("em que ano nos estamos: ")
      leia(anoAtual)
      escreva("Em que ano voce nasceu: ")
      leia(anoNascimento)
         idade <- anoAtual-anoNascimento
      se(idade < 18)entao
           escreva("Voce é menor de idade voce tem", idade )
      senao
            escreval("Voce é maior de idade voce tem", idade)
      fimse




fimalgoritmo