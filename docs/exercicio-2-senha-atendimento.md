# Exercicio 2 - Senhas de atendimento

## Enunciado
Implemente a fila de senhas de um guiche com capacidade fixa. Quem retira senha primeiro deve ser chamado primeiro. Quando uma senha e atendida, a vaga liberada deve poder ser reutilizada.

## TAD e decisao
O TAD e uma **fila estatica circular**. Ela respeita FIFO: primeiro a entrar, primeiro a sair. O array circular evita deslocar todas as senhas a cada atendimento. Uma pilha seria errada porque atenderia primeiro a senha mais recente.

## Big O
`emitirSenha` e `chamarProxima` sao O(1), pois usam os indices `fim` e `inicio`. `estaVazia` e `estaCheia` sao O(1). `exibirFila` e O(n), pois visita cada senha pendente. A memoria e O(capacidade).

## Leitura do codigo
1. `senhas` e o array de capacidade fixa.
2. `inicio` aponta a senha que sera chamada; `fim` aponta a proxima vaga de entrada.
3. `tamanho` diferencia fila vazia de fila cheia.
4. O construtor cria o array; os inteiros iniciam em zero automaticamente.
5. `emitirSenha` recusa a insercao quando cheia, grava no fim e avanca circularmente com `%`.
6. `chamarProxima` le e limpa a frente, avanca `inicio` circularmente e reduz `tamanho`.
7. `estaVazia` e `estaCheia` comparam `tamanho` com zero e com a capacidade.
8. `exibirFila` usa `posicao` para contar elementos logicos e `indiceReal` para localizar cada um no array circular.
9. `main` mostra que A004 ocupa a vaga liberada por A001, sem alterar a ordem das demais.