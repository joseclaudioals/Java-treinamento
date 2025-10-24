### Exercícios

**1) Conversor de Reais para Dólares**

**Enunciado**: Leia a cotação do dólar e um valor em reais. Mostre quantos dólares esse valor compra.

**Entrada**: cotacaoDolar (R$/US$), valorReais (R$)

**Processamento**: valorDolares ← valorReais / cotacaoDolar

**Saída**: Valor em dólares com 2 casas

**Exemplo**

**Entrada**

cotacaoDolar: 5.20

valorReais: 260.00

**Saída**

Dólares: 50.00



**2) Litros a Abastecer**

**Enunciado**: Leia o preço do litro do combustível e o valor em dinheiro para abastecer. Mostre quantos litros serão comprados.

**Entrada**: precoComb (R$/L), valorAbast (R$)

**Processamento**: litros ← valorAbast / precoComb

Saída: Litros com 2 casas

**Exemplo**

**Entrada**

precoComb: 2.70

valorAbast: 50.00

**Saída**

Litros: 18.52



**3) Celsius → Fahrenheit**

**Enunciado**: Converta uma temperatura de Celsius para Fahrenheit. Fórmula: F ← (9 \* C + 160) / 5.

**Entrada**: C (°C)

**Processamento**: F ← (9 \* C + 160) / 5

**Saída**: Temperatura em °F

**Exemplo**

**Entrada**

C: 25

**Saída**

Fahrenheit: 77.0



**4) Área do Círculo**

**Enunciado**: Leia o raio e calcule a área do círculo.

**Entrada**: raio

**Processamento**: area ← π \* raio \* raio

**Saída**: Área com 2 casas

**Exemplo**

**Entrada**

raio: 3.0

**Saída**

Área: 28.27



**5) Boleto em Atraso**

**Enunciado**: Leia o valor do boleto, o percentual de juros ao dia e os dias de atraso. Calcule o novo valor.

**Entrada**: valor (R$), juros (% ao dia), dias (int) Processamento: prestacao ← valor + (valor \* (juros/100)) \* dias

**Saída**: Valor atualizado com 2 casas

**Exemplo**

**Entrada**

valor: 1000.00

juros: 0.5

dias: 10

**Saída**

Prestação: 1050.00



**6) Multa por Excesso de Velocidade**

**Enunciado**: Leia a velocidade de um carro. Se ultrapassar 80 km/h, exiba multa de R$ 5 por km acima do limite; caso contrário, informe que está dentro do limite.

**Entrada**: vel (km/h)

**Processamento**: Se vel > 80, multa ← 5 \* (vel − 80); senão, multa = 0

**Saída**: Mensagem com ou sem multa

**Exemplo**

**Entrada**

vel: 90

**Saída**

Multado! Valor da multa: 50.00



**7) Reajuste Salarial**

**Enunciado**: Leia o salário e calcule o novo salário: > R$ 1.250,00 → +10%; ≤ R$ 1.250,00 → +15%.

**Entrada**: salario (R$)

**Processamento**: Aplicar a regra de reajuste conforme a faixa

**Saída**: Novo salário com 2 casas

**Exemplo**

**Entrada**

salario: 1000.00

**Saída**

Novo salário: 1150.00



**8) Preço da Passagem**

**Enunciado**: Leia a distância da viagem (km). Até 200 km: R$ 0,50/km; acima: R$ 0,45/km.

**Entrada**: km

**Processamento**: tarifa por regra

**Saída**: Valor com 2 casas

**Exemplo**

**Entrada**

km: 250

**Saída**

Preço da passagem: 112.50



**9) Aprovação de Empréstimo Imobiliário**

**Enunciado**: Leia valor da casa, salário e anos para pagar. Prestação mensal = valorCasa / (anos \* 12); deve ser ≤ 30% do salário.

**Entrada**: valorCasa (R$), salario (R$), anos (int)

**Processamento**: Calcular prestação e comparar com 0.30 \* salario

**Saída**: “Aprovado” ou “Negado” + prestação

**Exemplo**

**Entrada**

valorCasa: 240000

salario: 4000

anos: 20

**Saída**

Aprovado. Prestação: 1000.00



**10) Contagem de 1 até N**

**Enunciado**: Leia N e imprima de 1 até N na mesma linha.

**Entrada**: N (int)

**Processamento**: laço de 1 a N

**Saída**: números separados por espaço

**Exemplo**

**Entrada**

N: 5

**Saída**

1 2 3 4 5



**11) Tabuada de Multiplicação**

**Enunciado**: Leia N e imprima a tabuada de 1 a 10 para N.

**Entrada**: N (int)

**Processamento**: laço de 1 a 10

**Saída**: 10 linhas: N x i = resultado

**Exemplo**

**Entrada**

N: 7

**Saída**

7 x 1 = 7

7 x 2 = 14

...

7 x 10 = 70



**12) Contagem de Pares e Ímpares**

**Enunciado**: Leia Q e, em seguida, Q números inteiros. Informe quantos são pares, quantos são ímpares e seus percentuais.

**Entrada**: Q (int), depois Q inteiros

**Processamento**: Contar pares/ímpares; % ← (quantidade / Q) \* 100

**Saída**: totais e percentuais com 1 casa

**Exemplo**

**Entrada**

Q: 6

números: 1 2 3 4 5 6

**Saída**

Pares: 3 (50.0%)

Ímpares: 3 (50.0%)



**13) Primos em um Intervalo**

**Enunciado**: Leia A e B (A ≤ B) e liste todos os primos no intervalo, além da quantidade.

**Entrada**: A (int), B (int)

**Processamento**: Teste de primalidade para cada número

**Saída**: lista e contagem

**Exemplo**

**Entrada**

A: 10

B: 20

**Saída**

Primos: 11 13 17 19

Quantidade: 4



**14) Fatorial**

**Enunciado**: Leia N (0 ≤ N ≤ 20) e calcule N!.

**Entrada**: N (int)

**Processamento**: laço multiplicativo

Saída: valor de N!

**Exemplo**

**Entrada**

N: 5

**Saída**

Fatorial: 120



**15) Fibonacci (N termos)**

**Enunciado**: Leia N (N ≥ 1) e imprima os N primeiros termos da sequência de Fibonacci começando em 0, 1.

**Entrada**: N (int)

**Processamento**: laço somando os dois anteriores

**Saída**: termos em uma linha

**Exemplo**

**Entrada**

N: 8

**Saída**

0 1 1 2 3 5 8 13



**16) MDC (Máximo Divisor Comum)**

**Enunciado**: Leia dois inteiros positivos e calcule o MDC (algoritmo de Euclides).

Entrada: a (int), b (int)

**Processamento**: Enquanto b ≠ 0: temp ← b; b ← a % b; a ← temp

**Saída**: MDC

**Exemplo**

**Entrada**

a: 54

b: 24

**Saída**

MDC: 6



**17)  Estatística de Notas**

**Enunciado**: Leia Q e depois Q notas (0.0 a 10.0). Mostre média, maior, menor e o percentual de notas ≥ 7.0.

**Entrada**: Q (int), depois Q double

**Processamento**: Acumular soma, rastrear extremos e contar ≥ 7.0

**Saída**: média (2 casas), maior, menor e percentual (1 casa)

**Exemplo**

**Entrada**

Q: 5

notas: 10.0 8.0 7.0 5.0 5.0

**Saída**

Média: 7.00

Maior: 10.00

Menor: 5.00

≥ 7.0: 60.0%



**18) Palíndromo (Ignorando Espaços e Pontuação)**

**Enunciado**: Leia uma frase e diga se é palíndromo desconsiderando espaços e pontuação (não precisa remover acentos se não quiser — pode ser um extra).

**Entrada**: frase (linha)

**Processamento**: Normalizar (minúsculas, remover espaços e \[^a-z0-9]), comparar com reverso

**Saída**: “É palíndromo” ou “Não é palíndromo”

**Exemplo**

**Entrada**

frase: anotaram a data da maratona

**Saída**

É palíndromo



**19) Validador de Data**

**Enunciado**: Leia dia, mês e ano e informe se a data é válida (considerando anos bissextos).

**Entrada**: dia (int), mes (int), ano (int)

**Processamento**: Verificar mês, dias do mês e regra de bissexto: (ano % 400 == 0) || (ano % 4 == 0 \&\& ano % 100 != 0)

**Saída**: “Válida” ou “Inválida”

**Exemplo**

**Entrada**

29 2 2024

**Saída**

Válida

**Outro exemplo**

31 4 2023 → Inválida

