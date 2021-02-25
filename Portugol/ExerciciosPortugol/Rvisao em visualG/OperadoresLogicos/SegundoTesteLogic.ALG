algoritmo "semnome"
var
L1, L2, L3 : real
EQ, ES, TRI: logico
inicio
      escreva("Digite o primeiro lado do triangulo: ")
      leia(L1)
      escreva("Digite o segundo lado do  do triangulo : ")
      leia(L2)
      escreva("Digite o terceiro lado do triangulo:  ")
      leia(L3)
      TRI <- (L1 < L2 + L3) e (L2 < L1 + l3) e (L3 < L1 + l2)
      EQ <- (L1  = L2) e (L2 = L3)
      ES <- (L1 <> l2) e (L2 <> L3) e (L1 <> L3)
      escreval("POde forma um triangulo? : ", TRI)
      escreval("O trinagulo é equilatero?:  ", EQ)
      escreva("O triangulo é Escaleno?: ", ES)

fimalgoritmo