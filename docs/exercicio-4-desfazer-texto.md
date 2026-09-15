# Exercicio 4 - Desfazer em um editor

## Enunciado
Implemente um historico limitado de acoes em um editor. Cada nova acao deve poder ser desfeita; ao acionar desfazer, a ultima acao registrada e a que retorna.

## TAD e decisao
O TAD e uma **pilha estatica**. O comando desfazer naturalmente segue LIFO: a acao mais recente deve ser revertida antes das anteriores. Uma fila inverteria esse comportamento e tentaria desfazer a acao mais antiga.

## Big O
`registrarAcao`, `desfazer` e `ultimaAcao` sao O(1), pois usam somente `topo`. A memoria e O(capacidade), definida no construtor.

## Leitura do codigo
1. `acoes` guarda textos que descrevem alteracoes; o array tem tamanho fixo.
2. `topo` identifica a ultima acao valida; comeca em `-1`.
3. O construtor cria o historico na capacidade solicitada.
4. `registrarAcao` verifica se o topo ja chegou ao ultimo indice, avanca-o e salva a acao.
5. `desfazer` retorna `null` se vazio; caso contrario guarda a acao do topo, limpa a celula e reduz o topo.
6. `ultimaAcao` consulta o topo sem removê-lo; o operador ternario escolhe `null` para pilha vazia.
7. `main` registra tres operacoes, desfaz a ultima e consulta a nova acao no topo.