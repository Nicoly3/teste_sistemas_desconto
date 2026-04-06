# teste_sistemas_desconto
atividade elaborada no senai com intenção de praticar as skils de dev
test001: validação de entrada de números 
entrada: -1
retorno_esperado: que exiba uma mensagem de erro sem travar o sistema 
resultado:  o código não apresentou nenhuma mensagem de erro . prosseguiu mesmo o número sendo negativo.

test002: validação de entrada de valor com letras  
entrada: A
retorno_esperado: informar uma mensagem de erro sem travar o sistema   
resultado : o resultado é o esperado, foi informado a mensagem de erro.

test003: teste com um valor de número inteiro positivo
entrada: 100
retorno_esperado: que proseguisse com o código e execultassem sem informar nennum erro 
resultado : o resultado foi o esperado, não foi informado erro e foi feito o calculo.

test004: teste com caractere especial 
entrada: @
retorno_esperado: é esperado que o sistema aponte uma mensagem de erro 
resultado : o sistema identificou o erro e informou a mensagem esperada 

test005:validação do desconto com negativo 
entrada:-1
retorno_esperado:aponte o erro sem travar o sistema e não prossiga o calculo
resultado : O código não apresentou mensagem de erro.

test006: validação do desconto com valor maior que 50% 
entrada:60
retorno_esperado:aponte o erro sem travar o sistema e não prossiga o calculo
resultado : O código não apresentou mensagem de erro.

test007:validação do desconto com valor correto
entrada:40
retorno_esperado:que o código proseguisse o código e faça o calculo corretamente
resultado : O código não calculou o desconto corretamente

test008:validação de entrada com letras 
entrada:A
retorno_esperado:Informar uma mensagem de erro
resultado : foi o resultado esperado,foi informado a mensagem de erro.

test009:validação com caractere especial
entrada:#
retorno_esperado: que o sistema aponte uma mensagem de erro sem travar o código
resultado : o resultado foi o esperado,apresentou uma mensagem erro.


