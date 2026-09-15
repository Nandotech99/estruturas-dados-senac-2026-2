# Exercicio 3 - Catalogo reduzido de produtos

## Enunciado
Implemente um catalogo com no maximo cinco produtos. Deve ser possivel adicionar ao final, inserir em uma posicao determinada e buscar um produto pelo nome.

## TAD e decisao
O TAD e uma **lista sequencial estatica**: os elementos ocupados ficam nas primeiras posicoes de um array e `tamanho` informa ate onde a lista existe. Ela e adequada quando existe capacidade maxima conhecida e acesso por indice importa. Nao ha nos ou referencias: portanto nao e lista encadeada.

## Big O
Adicionar no final e O(1). Inserir em uma posicao e O(n), porque desloca elementos a direita. Buscar e O(n), porque pode examinar toda a lista. Exibir e O(n). A memoria e O(capacidade).

## Leitura do codigo
1. `produtos` e o array que representa a lista; `tamanho` conta somente celulas em uso.
2. O construtor fixa a capacidade do catalogo.
3. `adicionarNoFim` verifica limite, grava em `produtos[tamanho]` e incrementa `tamanho`.
4. `inserirNaPosicao` valida capacidade e indice; `posicao` desloca itens do fim ate o indice para abrir espaco.
5. Depois do deslocamento, o novo produto e gravado e o tamanho aumenta.
6. `buscar` percorre com `indice` apenas a parte ocupada e retorna o indice encontrado ou `-1`.
7. `exibir` percorre a lista logica e imprime indice e produto.
8. `main` inclui uma mochila entre dois itens e procura a caneta.