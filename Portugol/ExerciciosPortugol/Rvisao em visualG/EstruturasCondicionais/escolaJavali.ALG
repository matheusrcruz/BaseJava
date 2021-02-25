algoritmo "semnome"
var
   nota1, nota2, media: real
inicio

   escreval("-----------------------------------------------")
   escreval("Escola JavaLI se não passar de ano tem que rir")
   escreval("-----------------------------------------------")
   escreva("Digite sua nota: ")
   leia(nota1)
   escreva("Segunda nota: ")
   leia(nota2)
   media <- (nota1+nota2)/2
   se(media < 7)entao
      escreval("reprovado sua media foi", media, " Pode rir nos veremos novamente")
   senao
      escreval("Voce foi aprovado: ", media)
   fimse




fimalgoritmo