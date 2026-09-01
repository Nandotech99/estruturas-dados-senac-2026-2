# Exercicio 01 - Vetor no Supermercado

## Cenario real

Voce esta desenvolvendo um sistema simples para um supermercado de bairro.
No fim do dia, o gerente quer registrar o faturamento de cada caixa e descobrir:
- Quanto foi o total do dia.
- Qual caixa vendeu mais.
- Qual caixa vendeu menos.

Como existe uma quantidade fixa de caixas, a melhor estrutura inicial e um vetor.

## Objetivo

Criar um programa que receba 5 valores de faturamento, armazene em um vetor e calcule resumo do dia.

## Passo a passo guiado

1. Declare um vetor de tamanho 5 para guardar faturamentos em `double`.
2. Crie um `for` para ler os 5 valores.
3. Crie variaveis para:
   - `soma`.
   - `maiorValor`.
   - `menorValor`.
   - `indiceMaior` e `indiceMenor`.
4. Percorra o vetor e atualize as variaveis de controle.
5. Mostre na tela:
   - Total vendido.
   - Media por caixa.
   - Caixa com maior venda.
   - Caixa com menor venda.

## Dicas

- Inicialize `maiorValor` e `menorValor` com o primeiro elemento do vetor.
- Lembre que o indice comeca em 0. Para mostrar numero do caixa, use `indice + 1`.

## Saida esperada (exemplo)

Total do dia: 10500.00
Media por caixa: 2100.00
Maior venda: Caixa 4 com 3200.00
Menor venda: Caixa 2 com 1200.00

## Desafio extra

Mostre tambem quantos caixas ficaram acima da media.